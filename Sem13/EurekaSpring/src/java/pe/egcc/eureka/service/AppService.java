package pe.egcc.eureka.service;

import org.springframework.stereotype.Service;

@Service
public class AppService extends AbstractJdbcSupport {

  public int getCantCuentas() {
    String sql = "select count(*) from cuenta";
    int rowCount = jdbcTemplate.queryForObject(sql, Integer.class);
    return rowCount;
  }

  public double getSaldoMoneda(String moneda) {
    String sql = "select sum(dec_cuensaldo) from cuenta "
            + "where chr_monecodigo = ?";
    Double saldo = jdbcTemplate.queryForObject(sql, Double.class, moneda);
    return saldo;
  }

}
