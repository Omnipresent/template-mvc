/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.Retina;
import model.TableModel;
import org.springframework.stereotype.Service;

@Service("retinaService")
public class RetinaServiceImpl implements RetinaService {

    List <Retina> retinas = new ArrayList<Retina>();
    
    public RetinaServiceImpl () {
        for (int i = 0; i < 100; i++) {
            Retina retina = new Retina();
            retina.setId(i);
            retina.setMachineName("Machine " + i);
            retina.setSoftware("Software " + i);
            retina.setVulnerability("Vulnerability " + i);
            retinas.add(retina);
        }
    }
    
    public List<Retina> getRetinaData(TableModel<Retina> tableModel) {
        int from = tableModel.getFrom();
        int to = tableModel.getTo();
        return retinas.subList(from, to);
    }

    
    public int getRetinaAmount() {
        return retinas.size();
    }
    
}
