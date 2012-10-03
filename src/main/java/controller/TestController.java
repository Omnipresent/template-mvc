package controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value="/mytest",method=RequestMethod.GET)
	public String showView(){
		//model.addAttribute("user", new User());
        if (logger.isDebugEnabled()) {
            logger.debug("Get users action is running...");
        }
		return "view/hello";
	}
        
    @RequestMapping(value = "/myleaf",method=RequestMethod.GET) 
    public ModelAndView showLeaf() {
        String test = "This is from leaf";
        return new ModelAndView("thymeview/helloleaf", "message", test);
    }
    
    
}
