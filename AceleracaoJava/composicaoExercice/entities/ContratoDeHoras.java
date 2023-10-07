package entities;

import java.util.Date;

public class ContratoDeHoras {
  private Date date;
  private double valorPorHora;
  private int horas;

  public ContratoDeHoras() {}


  public ContratoDeHoras(Date date, double valorPorHora, int horas) {
    super();
    this.date = date;
    this.valorPorHora = valorPorHora;
    this.horas = horas;
  }

  public double totalValor() {
    return valorPorHora * horas;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public double getValorPorHora() {
    return valorPorHora;
  }

  public void setValorPorHora(double valorPorHora) {
    this.valorPorHora = valorPorHora;
  }

  public int getHoras() {
    return horas;
  }

  public void setHoras(int horas) {
    this.horas = horas;
  }

}
