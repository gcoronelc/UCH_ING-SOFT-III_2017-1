package pe.egcc.prestamo.prueba;

import java.util.List;
import pe.egcc.prestamo.model.PrestamoModel;
import pe.egcc.prestamo.service.PrestamoService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    double capital = 1000.0;
    double interes = 10;
    int meses = 10;
    // Proceso
    PrestamoService service = new PrestamoService();
    List<PrestamoModel> repo;
    repo = service.procPrestamo(capital, interes, meses);
    // Reporte
    for (PrestamoModel bean : repo) {
      String linea = bean.getMes() + 
              " - " + bean.getCapital() +
              " - " + bean.getInteres() +
              " - " + bean.getTotal();
      System.out.println(linea);
    }
  }
  
}
