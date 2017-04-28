package pe.egcc.eureka.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.egcc.eureka.db.AccesoDB;

public class CuentaService {

  public double conSaldo(String cuenta){
    double saldo = 0.0;
    // ---------------------------------------------------------------
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select dec_cuensaldo from cuenta "
              + "where chr_cuencodigo=?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, cuenta);
      ResultSet rs = pstm.executeQuery();
      if(!rs.next()){
        throw new SQLException("Cuenta no existe.");
      }
      saldo = rs.getDouble("dec_cuensaldo");
      rs.close();
      pstm.close();
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
