package pe.egcc.ventaapp.prueba;

import java.util.List;
import pe.egcc.ventaapp.model.ResumenModel;
import pe.egcc.ventaapp.model.VentaModel;
import pe.egcc.ventaapp.service.impl.VentaService;

public class Prueba02 {

  public static void main(String[] args) {
    // Servicio
    VentaService service = new VentaService();
    // Agregar ventas
    List<String> cate = service.getCategorias();
    service.regVenta(new VentaModel(cate.get(0), "Pedro", "Algo", 345.87, 4));
    service.regVenta(new VentaModel(cate.get(1), "Pedro", "Sdddd", 456.23, 7));
    service.regVenta(new VentaModel(cate.get(2), "Pedro", "Eeeee", 123.45, 3));
    service.regVenta(new VentaModel(cate.get(1), "Pedro", "Aalgo", 986.12, 8));
    service.regVenta(new VentaModel(cate.get(01), "Pedro", "Aaaaa", 765.78, 9));
    // Listado
    System.out.println("LISTADO");
    System.out.println("----------------------------------------");
    List<VentaModel> ventas = service.listadoVentas(cate.get(1));
    for (VentaModel venta : ventas) {
      System.out.println(venta.toString());
    }
    
    // Resumen
    System.out.println("RESUMEN");
    System.out.println("------------------------------------");
    for(ResumenModel model: service.obtenerResumen()){
      System.out.println(model.toString());
    }

  }

}
