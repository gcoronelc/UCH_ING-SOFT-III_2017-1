package pe.egcc.prestamo.service;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.prestamo.model.PrestamoModel;

public class PrestamoService {

  public List<PrestamoModel> procPrestamo(double capital,
          double porcInteres, int meses){
    List<PrestamoModel> lista = new ArrayList<>();
    // Proceso
    double capitalCuota = redondear(capital / meses);
    for (int mes = 1; mes <= meses; mes++) {
      if(mes == meses){
        capitalCuota = redondear(capital);
      }
      double interesCuota = redondear( capital * porcInteres / 100 );
      double totalCuota = redondear( capitalCuota + interesCuota );
      PrestamoModel bean = new PrestamoModel(mes, 
              capitalCuota, interesCuota, totalCuota);
      lista.add(bean);
      capital -= capitalCuota;
    }
    return lista;
  }
  
  private double redondear(double valor){
    valor *= 100.0;
    valor = Math.round(valor);
    valor /= 100;
    return valor;
  }
  
  
}
