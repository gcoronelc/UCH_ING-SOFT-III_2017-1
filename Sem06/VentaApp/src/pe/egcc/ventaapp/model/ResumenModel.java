package pe.egcc.ventaapp.model;

public class ResumenModel {

  private String categoria;
  private int cantidad;
  private double importe;
  private double impuesto;
  private double total;

  public ResumenModel() {
  }

  public ResumenModel(String categoria, int cantidad, double importe, double impuesto, double total) {
    this.categoria = categoria;
    this.cantidad = cantidad;
    this.importe = importe;
    this.impuesto = impuesto;
    this.total = total;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

  public double getImpuesto() {
    return impuesto;
  }

  public void setImpuesto(double impuesto) {
    this.impuesto = impuesto;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  @Override
  public String toString() {
    String repo;
    repo = categoria + " | " + cantidad + " | " + importe
            + " | " + impuesto + " | " + total;
    return repo;
  }

  
}
