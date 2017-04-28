package pe.egcc.eureka.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class AccesoDB {

  private AccesoDB() {
  }

  
  public static Connection getConnection() throws SQLException{
    // Datos
    Connection cn = null;
    String driver = "com.mysql.jdbc.Driver";
    String urlDB = "jdbc:mysql://localhost:3306/eurekabank";
    String user = "eureka";
    String pass = "admin";
    try {
      // Proceso
      Class.forName(driver).newInstance();
      cn = DriverManager.getConnection(urlDB, user, pass);
    } catch (SQLException e){
      throw e;
    } catch(ClassNotFoundException e){
      throw new SQLException("No se ha encontrado el driver..");
    } catch(Exception e){
      throw new SQLException("No se tiene acceso al servidor.");
    }
    return cn; 
  }


  
}
