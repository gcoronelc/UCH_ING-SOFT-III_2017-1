package pe.egcc.eureka.model;

public class Combo {

  private String codigo;
  private String nombre;
  private String selected;

  public Combo() {
  }

  public Combo(String codigo, String nombre) {
    this.codigo = codigo;
    this.nombre = nombre;
  }

  public Combo(String codigo, String nombre, String selected) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.selected = selected;
  }

  public void setSelected(String selected) {
    this.selected = selected;
  }

  public String getSelected() {
    return selected;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

}
