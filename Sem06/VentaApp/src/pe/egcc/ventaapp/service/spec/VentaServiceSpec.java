package pe.egcc.ventaapp.service.spec;

import java.util.List;
import pe.egcc.ventaapp.model.ResumenModel;
import pe.egcc.ventaapp.model.VentaModel;

public interface VentaServiceSpec {
  
  /**
   * Retorna la lista de categorias.
   * 
   * @return Lista de categorias.
   */
  public List<String> getCategorias();

  /**
   * Calcula una venta.
   * 
   * @param venta
   * @return 
   */
  public VentaModel calcVenta(VentaModel venta);
  
  /**
   * Registra una venta.
   * 
   * @param venta 
   */
  public void regVenta(VentaModel venta);
  
  /**
   * Retorna la ventas por categoria.
   * 
   * @param categoria
   * @return 
   */
  public List<VentaModel> listadoVentas(String categoria);
  
  
  public List<ResumenModel> obtenerResumen();
  
}
