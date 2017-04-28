package pe.egcc.eureka.prueba;

import pe.egcc.eureka.service.CuentaService;

public class Prueba02 {

  public static void main(String[] args) {
    try {
      // Dato
      String cuenta = "00100001";
      // Proceso
      CuentaService service = new CuentaService();
      double saldo = service.conSaldo(cuenta);
      // Reporte
      System.out.println("Cuenta: " + cuenta);
      System.out.println("Saldo: " + saldo);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
  
}
