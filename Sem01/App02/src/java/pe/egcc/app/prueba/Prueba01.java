package pe.egcc.app.prueba;

import pe.egcc.app.model.VentaModel;
import pe.egcc.app.service.VentaService;

public class Prueba01 {
  
  public static void main(String[] args) {
    // Datos
    VentaModel model = new VentaModel(456.78,4.5);
    
    // Proceso
    VentaService service = new VentaService();
    model = service.procesar(model);
    
    // Reporte
    System.out.println("Importe: " + model.getImporte());
    System.out.println("Impuesto: " + model.getImpuesto());
    System.out.println("Total: " + model.getTotal());
    
  }
  
  
}
