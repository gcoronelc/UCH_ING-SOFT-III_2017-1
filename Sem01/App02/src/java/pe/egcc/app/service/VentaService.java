package pe.egcc.app.service;

import pe.egcc.app.model.VentaModel;

public class VentaService {

  public VentaModel procesar(VentaModel model){
    
    // Variables
    double importe, impuesto, total;

    // Proceso
    total = model.getPrecio() * model.getCant();
    importe = total / 1.18;
    impuesto = total - importe;
    
    // Reporte
    model.setImporte(importe);
    model.setImpuesto(impuesto);
    model.setTotal(total);
    
    return model;
  }
  
}
