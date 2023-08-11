package Bloco3POO.imobiliaria.imoveis;

import java.time.LocalDate;

public class Aluguel extends Imovel {

  private double valorAluguel;
  private boolean alugado;

  public Aluguel(String endereco, LocalDate date, double valorAluguel) {
    super(endereco, date);
    this.valorAluguel = valorAluguel;
    this.alugado = false;
  }

  public double getValorAluguel() {
    return valorAluguel;
  }

  public void setValorAluguel(double valorAluguel) {
    this.valorAluguel = valorAluguel;
  }

  public boolean isAlugado() {
    return alugado;
  }

  public void alugar() {
    if (ativo) {
      this.alugado = true;
    }
  }

}
