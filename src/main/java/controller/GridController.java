package controller;

import java.io.IOException;
import java.io.Writer;

import java.util.List;
import net.sf.json.JSONObject;
import model.Retina;
import model.TableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.RetinaService;


@Controller
@RequestMapping("/retina")
public class GridController {
    
    private static final Logger logger = LoggerFactory.getLogger(GridController.class);
    
    @Autowired
    private RetinaService retinaService;
    
    public void setRetinaService (RetinaService retinaService) {
        this.retinaService = retinaService;
    }
    
    @RequestMapping(value = "/getRetinaData", method = RequestMethod.GET)
    public void getUsers(@RequestParam("page") int pageNumber, 
                         @RequestParam("rows") int rowsAmountLimit,
                         @RequestParam("sidx") String sortedColumnIndex, 
                         @RequestParam("sord") String sortOrder, 
                         Writer writer) throws IOException {
        int recordsAmount = retinaService.getRetinaAmount();
        
        TableModel <Retina> tableModel = new TableModel<Retina>(pageNumber, rowsAmountLimit, recordsAmount, sortedColumnIndex, sortOrder);
        
        List<Retina> retinas = retinaService.getRetinaData(tableModel);
        
        tableModel.setRows(retinas);
        String jsonObject = JSONObject.fromObject(tableModel).toString();
        
        writer.write(jsonObject);        
    }

    @RequestMapping(value = "/showRetinaData", method = RequestMethod.GET)
    public String showUsers(Model model) {
        model.addAttribute("title", "Retina Data");
        return "grid/retinaList";
    }    
    
}
