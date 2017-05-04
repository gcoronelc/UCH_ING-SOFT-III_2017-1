package pe.egcc.ventaapp.util;

public class MateUtil {

  public static double roundTo2Dec(double valor){
    valor *= 100.0;
    valor = Math.round(valor);
    valor /= 100.0;
    return valor;
  }
  
}
