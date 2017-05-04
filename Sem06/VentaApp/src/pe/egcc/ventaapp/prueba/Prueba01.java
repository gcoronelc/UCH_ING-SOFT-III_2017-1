package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.VentaModel;
import pe.egcc.ventaapp.service.impl.VentaService;
import pe.egcc.ventaapp.service.spec.VentaServiceSpec;
import pe.egcc.ventaapp.util.MateUtil;

public class Prueba01 {

  public static void main(String[] args) {
    // Service
    VentaServiceSpec ventaService = new VentaService();
    // Dato
    VentaModel model = new VentaModel();
    model.setCliente("Yo");
    model.setCategoria(ventaService.getCategorias().get(0));
    model.setProducto("Demo");
    model.setPrecio(456.78);
    model.setCantidad(10);
    // Proceso
    model = ventaService.calcVenta(model);
    // Reporte
    System.out.println("Precio: " + model.getPrecio());
    System.out.println("Cantidad: " + model.getCantidad());
    System.out.println("Subtotal: " + model.getSubtotal());
    System.out.println("Impuesto: " + model.getImpuesto());
    System.out.println("Total: " + model.getTotal());
  }
  
}
