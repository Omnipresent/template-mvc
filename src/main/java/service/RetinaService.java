package service;

import java.util.List;
import model.Retina;
import model.TableModel;

public interface RetinaService {
    List<Retina> getRetinaData(TableModel<Retina> tableModel);    
    int getRetinaAmount();
}
