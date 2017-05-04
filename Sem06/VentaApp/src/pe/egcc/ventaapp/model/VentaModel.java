package pe.egcc.ventaapp.model;

public class VentaModel {

  // Datos
  private String categoria;
  private String cliente;
  private String producto;
  private double precio;
  private int cantidad;
  // Resultado
  private double subtotal;
  private double impuesto;
  private double total;

  public VentaModel() {
  }

  public VentaModel(String categoria, String cliente, String producto, double precio, int cantidad) {
    this.categoria = categoria;
    this.cliente = cliente;
    this.producto = producto;
    this.precio = precio;
    this.cantidad = cantidad;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public double getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(double subtotal) {
    this.subtotal = subtotal;
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
    String repo = categoria + " | " + producto 
            + " | " + subtotal 
            + " | " + impuesto
            + " | " + total;
    return repo;
  }
  
  

}
