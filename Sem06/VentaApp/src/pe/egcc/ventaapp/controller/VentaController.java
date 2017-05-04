package pe.egcc.ventaapp.controller;

import java.util.List;
import pe.egcc.ventaapp.model.ResumenModel;
import pe.egcc.ventaapp.model.VentaModel;
import pe.egcc.ventaapp.service.impl.VentaService;

public class VentaController {

  private VentaService ventaService;

  public VentaController() {
    ventaService = new VentaService();
  }
  
  public List<String> getCategorias() {
    return ventaService.getCategorias();
  }

  public void regVenta(VentaModel model) {
    ventaService.regVenta(model);
  }
  
  public List<ResumenModel> getResumen(){
    return ventaService.obtenerResumen();
  }
  
}
