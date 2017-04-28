package pe.egcc.eureka.service;

import java.sql.Connection;
import java.sql.SQLException;
import pe.egcc.eureka.db.AccesoDB;

public class CuentaService {

  public double conSaldo(String cuenta){
    double saldo = 0.0;
    // ---------------------------------------------------------------
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      
    } catch (SQLException e) {
      throw new RuntimeException(e.getMessage());
    } catch (Exception e) {
      throw new RuntimeException("Error en la consulta.");
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    // ---------------------------------------------------------------
    return saldo;
  }

  
}
