package pe.egcc.ventaapp.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import pe.egcc.ventaapp.model.ResumenModel;
import pe.egcc.ventaapp.model.VentaModel;
import pe.egcc.ventaapp.service.spec.VentaServiceSpec;
import pe.egcc.ventaapp.util.MateUtil;

public class VentaService implements VentaServiceSpec{

  @Override
  public List<String> getCategorias() {
    String[] categorias = {
        Data.LAPTOPS,    
        Data.CELULARES,
        Data.TABLE,
        Data.TELEVISORES,
        Data.IMPRESORAS,
        Data.ACCESORIOS};
    List<String> lista = Arrays.asList(categorias);
    return lista;
  }

  @Override
  public VentaModel calcVenta(VentaModel venta) {
    // Varibles    
    double subtotal, impuesto, total;
    // Proceso
    total = MateUtil.roundTo2Dec(venta.getPrecio() * venta.getCantidad());
    subtotal = MateUtil.roundTo2Dec(total / 1.18);
    impuesto = MateUtil.roundTo2Dec(total - subtotal);
    // Reporte
    venta.setSubtotal(subtotal);
    venta.setImpuesto(impuesto);
    venta.setTotal(total);
    return venta;
  }

  @Override
  public void regVenta(VentaModel venta) {
    venta = calcVenta(venta);
    Data.data.add(venta);
  }

  @Override
  public List<VentaModel> listadoVentas(String categoria) {
    List<VentaModel> listaAux = new ArrayList<>();
    for (VentaModel venta : Data.data) {
      if(venta.getCategoria().equals(categoria)){
        listaAux.add(venta);
      }
    }
    return listaAux;
  }

  @Override
  public List<ResumenModel> obtenerResumen() {
    List<ResumenModel> listaResumen = new ArrayList<>();
    // ------------------------------------------------------------
    List<String> categorias = getCategorias();
    for (String categoria : categorias) {
      ResumenModel resumen = obtenerResumenCategoria(categoria);
      if( resumen.getCantidad() > 0 ){
      listaResumen.add(resumen);
      }
    }
    // ------------------------------------------------------------
    return listaResumen;
  }

  private ResumenModel obtenerResumenCategoria(String categoria) {
    ResumenModel rm = new ResumenModel();
    rm.setCategoria(categoria);
    for(VentaModel ventaModel: Data.data){
      if(ventaModel.getCategoria().equals(categoria)){
      rm.setCantidad(rm.getCantidad() + ventaModel.getCantidad());
      rm.setImporte(rm.getImporte()+ ventaModel.getSubtotal());
      rm.setImpuesto(rm.getImpuesto()+ ventaModel.getImpuesto());
      rm.setTotal(rm.getTotal()+ ventaModel.getTotal());
      }
    }
    return rm;
  }
  
  
  
  
}
