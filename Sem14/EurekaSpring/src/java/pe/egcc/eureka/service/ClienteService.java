package pe.egcc.eureka.service;

import java.util.List;
import java.util.Map;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pe.egcc.eureka.mapper.ClienteMapper;
import pe.egcc.eureka.model.Cliente;

@Service
public class ClienteService extends AbstractJdbcSupport {

  private final String SQL_SELECT = "select "
          + "chr_cliecodigo codigo, "
          + "vch_cliepaterno paterno, "
          + "vch_cliematerno materno, "
          + "vch_clienombre nombre, "
          + "chr_cliedni dni, "
          + "vch_clieciudad ciudad, "
          + "vch_cliedireccion direccion, "
          + "vch_clietelefono telefono, "
          + "vch_clieemail email "
          + "from cliente ";

  private final String SQL_INSERT = "";

  private final String SQL_UPDATE = "";

  private final String SQL_DELETE = "";

  public Cliente getCliente(String codigo) {
    Cliente bean = null;
    try {
      String sql = SQL_SELECT
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
      String sql = SQL_SELECT
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
    String sql = SQL_SELECT
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
    String sql = SQL_SELECT
            + "where vch_cliepaterno like concat('%',?,'%') "
            + "or vch_cliematerno like concat('%',?,'%') "
            + "or vch_clienombre like concat('%',?,'%') ";
    lista = jdbcTemplate.query(sql,
            new BeanPropertyRowMapper<Cliente>(Cliente.class),
            criterio, criterio, criterio);
    return lista;
  }

  public List<Map<String, Object>> getClientes3(String criterio) {
    List<Map<String, Object>> lista;
    String sql = SQL_SELECT
            + "where vch_cliepaterno like concat('%',?,'%') "
            + "or vch_cliematerno like concat('%',?,'%') "
            + "or vch_clienombre like concat('%',?,'%') ";
    lista = jdbcTemplate.queryForList(sql,
            criterio, criterio, criterio);
    return lista;
  }

  // =====================================================
  // IMPLEMENTACIÒN DEL CRUD
  // =====================================================
  /**
   * Consulta por código.
   *
   * @param codigo
   * @return
   */
  public Cliente read(String codigo) {
    Cliente bean = null;
    try {
      String sql = SQL_SELECT
              + "where chr_cliecodigo = ?";
      bean = jdbcTemplate.queryForObject(sql,
              new BeanPropertyRowMapper<Cliente>(Cliente.class),
              codigo);
    } catch (EmptyResultDataAccessException e) {
    }
    return bean;
  }

  /**
   * Consulta por paterno, materno y nombre.
   *
   * @param bean
   * @return
   */
  public List<Cliente> read(Cliente bean) {
    List<Cliente> lista;
    String sql = SQL_SELECT
            + "where vch_cliepaterno like concat('%',?,'%') "
            + "and vch_cliematerno like concat('%',?,'%') "
            + "and vch_clienombre like concat('%',?,'%') ";
    lista = jdbcTemplate.query(sql,
            new BeanPropertyRowMapper<Cliente>(Cliente.class),
            bean.getPaterno(), bean.getMaterno(), bean.getNombre());
    return lista;
  }

  /**
   * Inserta un nuevo cliente.
   *
   * @param bean
   */
  @Transactional(propagation = Propagation.REQUIRES_NEW,
          rollbackFor = Exception.class)
  public void create(Cliente bean) {
    
    // Leer contador
    String sql = "select int_contitem, int_contlongitud "
            + "from contador "
            + "where vch_conttabla='Cliente' "
            + "for update ";
    Map<String, Object> datos;
    datos = jdbcTemplate.queryForMap(sql);
    int cont = Integer.parseInt(datos.get("int_contitem").toString());
    int longitud = Integer.parseInt(datos.get("int_contlongitud").toString());
    
    // Retardo
    try {
      Thread.currentThread().sleep(2000);
    } catch (Exception e) {
    }
    
    
    
    // Crear el codigo
    cont++;
    String codigo = String.format("%" + longitud + "s", "" + cont)
            .replace(' ', '0');
    
    // Actualizar el contador
    sql = "update contador set int_contitem=? "
            + "where vch_conttabla='Cliente'";
    Object[] args = {cont};
    jdbcTemplate.update(sql, args);
    
    // Insertar cliente
    sql = "insert into cliente(chr_cliecodigo,vch_cliepaterno,"
            + "vch_cliematerno,vch_clienombre,chr_cliedni,"
            + "vch_clieciudad,vch_cliedireccion,vch_clietelefono,"
            + "vch_clieemail) values(?,?,?,?,?,?,?,?,?)";
    args = new Object[]{codigo, bean.getPaterno(), bean.getMaterno(),
      bean.getNombre(), bean.getDni(), bean.getCiudad(),
      bean.getDireccion(), bean.getTelefono(), bean.getEmail()};
    jdbcTemplate.update(sql, args);
    
    bean.setCodigo(codigo);
  }

  /**
   * Actualiza los datos del cliente.
   *
   * @param bean
   */
  public void update(Cliente bean) {

  }

  /**
   * Elimina el registro de un cliente.
   *
   * @param codigo
   */
  public void delete(String codigo) {

  }

}
