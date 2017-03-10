package pe.egcc.app.model;

public class VentaModel {

  // Datos
  private double precio;
  private double cant;
  // Resultado
  private double importe;
  private double impuesto;
  private double total;

  public VentaModel() {
  }

  public VentaModel(double precio, double cant) {
    this.precio = precio;
    this.cant = cant;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public double getCant() {
    return cant;
  }

  public void setCant(double cant) {
    this.cant = cant;
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

}
