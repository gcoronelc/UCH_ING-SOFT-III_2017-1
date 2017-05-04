package pe.egcc.ventaapp.service.impl;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.ventaapp.model.VentaModel;

final class Data {

  private Data() {
  }

  static List<VentaModel> data;

  static {
    data = new ArrayList<>();
  }

  static final String LAPTOPS = "LAPTOPS";
  static final String CELULARES = "CELULARES";
  static final String TABLE = "TABLE";
  static final String TELEVISORES = "TELEVISORES";
  static final String IMPRESORAS = "IMPRESORAS";
  static final String ACCESORIOS = "ACCESORIOS";

  
  
}
