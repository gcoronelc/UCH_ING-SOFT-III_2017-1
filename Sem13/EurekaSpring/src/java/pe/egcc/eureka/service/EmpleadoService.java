package pe.egcc.eureka.service;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;
import pe.egcc.eureka.model.Empleado;

@Service
public class EmpleadoService extends AbstractJdbcSupport{

  public Empleado validar(String usuario, String clave) {
    Empleado bean = null;
    try {
      String sql = "select "
              + "chr_emplcodigo     codigo, "
              + "vch_emplpaterno    paterno, "
              + "vch_emplmaterno    materno, "
              + "vch_emplnombre     nombre, "
              + "vch_emplciudad     ciudad, "
              + "vch_empldireccion  direccion "
              + "from empleado "
              + "where vch_emplusuario = ? "
              + "and vch_emplclave = ? ";
      bean = jdbcTemplate.queryForObject(sql, 
              new BeanPropertyRowMapper<Empleado>(Empleado.class),
              usuario, clave);
    } catch (EmptyResultDataAccessException e) {
    }
    return bean;
  }

}
