package pe.egcc.prestamo.service;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.prestamo.model.PrestamoModel;

public class PrestamoService {

  public List<PrestamoModel> procPrestamo(double capital,
          double porcInteres, int meses){
    List<PrestamoModel> lista = new ArrayList<>();
    // Proceso
    double capitalCuota = capital / meses;
    for (int mes = 1; mes <= meses; mes++) {
      double interesCuota = capital * porcInteres / 100;
      double totalCuota = capitalCuota + interesCuota;
      PrestamoModel bean = new PrestamoModel(mes, 
              capitalCuota, interesCuota, totalCuota);
      lista.add(bean);
      capital -= capitalCuota;
    }
    return lista;
  }
  
}
