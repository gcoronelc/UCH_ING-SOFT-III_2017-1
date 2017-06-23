package pe.egcc.eureka.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import pe.egcc.eureka.model.Cliente;

public class ClienteMapper implements RowMapper<Cliente> {

  @Override
  public Cliente mapRow(ResultSet rs, int i) throws SQLException {
    Cliente bean = new Cliente();
    bean.setCodigo(rs.getString("codigo"));
    bean.setPaterno(rs.getString("paterno"));
    bean.setMaterno(rs.getString("materno"));
    bean.setNombre(rs.getString("nombre"));
    bean.setDni(rs.getString("dni"));
    bean.setCiudad(rs.getString("ciudad"));
    bean.setDireccion(rs.getString("direccion"));
    bean.setTelefono(rs.getString("telefono"));
    bean.setEmail(rs.getString("email"));
    return bean;
  }

}
