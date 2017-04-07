package pe.egcc.prestamo.model;

public class PrestamoModel {

  private int mes;
  private double capital;
  private double interes;
  private double total;

  public PrestamoModel() {
  }

  public PrestamoModel(int mes, double capital, double interes, double total) {
    this.mes = mes;
    this.capital = capital;
    this.interes = interes;
    this.total = total;
  }

  
  public int getMes() {
    return mes;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public double getCapital() {
    return capital;
  }

  public void setCapital(double capital) {
    this.capital = capital;
  }

  public double getInteres() {
    return interes;
  }

  public void setInteres(double interes) {
    this.interes = interes;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

}
