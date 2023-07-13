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

}
