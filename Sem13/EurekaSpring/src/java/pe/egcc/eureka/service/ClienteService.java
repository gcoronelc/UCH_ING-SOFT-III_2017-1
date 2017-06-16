package pe.egcc.eureka.service;

import java.util.List;
import java.util.Map;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;
import pe.egcc.eureka.mapper.ClienteMapper;
import pe.egcc.eureka.model.Cliente;

@Service
public class ClienteService extends AbstractJdbcSupport {

  public Cliente getCliente(String codigo) {
    Cliente bean = null;
    try {
      String sql = "select "
              + "chr_cliecodigo,"
              + "vch_cliepaterno,"
              + "vch_cliematerno,"
              + "vch_clienombre,"
              + "chr_cliedni,"
              + "vch_clieciudad,"
              + "vch_cliedireccion,"
              + "vch_clietelefono,"
              + "vch_clieemail "
              + "from cliente "
              + "where chr_cliecodigo = ?";
      bean = jdbcTemplate.queryForObject(sql, 
              new ClienteMapper(), codigo);
    } catch (EmptyResultDataAccessException e) {
    }
    return bean;
  }
  public Cliente getCliente2(String codigo) {
    Cliente bean = null;
    try {
      String sql = "select "
              + "chr_cliecodigo codigo,"
              + "vch_cliepaterno paterno,"
              + "vch_cliematerno materno,"
              + "vch_clienombre nombre,"
              + "chr_cliedni dni,"
              + "vch_clieciudad ciudad,"
              + "vch_cliedireccion direccion,"
              + "vch_clietelefono telefono,"
              + "vch_clieemail email "
              + "from cliente "
              + "where chr_cliecodigo = ?";
      bean = jdbcTemplate.queryForObject(sql, 
              new BeanPropertyRowMapper<Cliente>(Cliente.class), 
              codigo);
    } catch (EmptyResultDataAccessException e) {
    }
    return bean;
  }

  public List<Cliente> getClientes(String criterio) {
    List<Cliente> lista;
      String sql = "select "
              + "chr_cliecodigo,"
              + "vch_cliepaterno,"
              + "vch_cliematerno,"
              + "vch_clienombre,"
              + "chr_cliedni,"
              + "vch_clieciudad,"
              + "vch_cliedireccion,"
              + "vch_clietelefono,"
              + "vch_clieemail "              
              + "from cliente "
              + "where vch_cliepaterno like concat('%',?,'%') "
              + "or vch_cliematerno like concat('%',?,'%') "
              + "or vch_clienombre like concat('%',?,'%') ";
      lista = jdbcTemplate.query(sql, 
              new ClienteMapper(), 
              criterio, criterio, criterio);
    return lista;
  }
  
  public List<Cliente> getClientes2(String criterio) {
    List<Cliente> lista;
      String sql = "select "
              + "chr_cliecodigo codigo,"
              + "vch_cliepaterno paterno,"
              + "vch_cliematerno materno,"
              + "vch_clienombre nombre,"
              + "chr_cliedni dni,"
              + "vch_clieciudad ciudad,"
              + "vch_cliedireccion direccion,"
              + "vch_clietelefono telefono,"
              + "vch_clieemail email "
              + "from cliente "
              + "where vch_cliepaterno like concat('%',?,'%') "
              + "or vch_cliematerno like concat('%',?,'%') "
              + "or vch_clienombre like concat('%',?,'%') ";
      lista = jdbcTemplate.query(sql, 
              new BeanPropertyRowMapper<Cliente>(Cliente.class), 
              criterio, criterio, criterio);
    return lista;
  }
  
  public List<Map<String,Object>> getClientes3(String criterio) {
    List<Map<String,Object>> lista;
      String sql = "select "
              + "chr_cliecodigo codigo,"
              + "vch_cliepaterno paterno,"
              + "vch_cliematerno materno,"
              + "vch_clienombre nombre,"
              + "chr_cliedni dni,"
              + "vch_clieciudad ciudad,"
              + "vch_cliedireccion direccion,"
              + "vch_clietelefono telefono,"
              + "vch_clieemail email "
              + "from cliente "
              + "where vch_cliepaterno like concat('%',?,'%') "
              + "or vch_cliematerno like concat('%',?,'%') "
              + "or vch_clienombre like concat('%',?,'%') ";
      lista = jdbcTemplate.queryForList(sql, 
              criterio, criterio, criterio);
    return lista;
  }

}
