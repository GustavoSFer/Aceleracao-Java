package Bloco3POO.imobiliaria.imoveis;

import java.time.LocalDate;

public class Venda extends Imovel {
  private double valorVenda;
  private boolean alugado;

  public Venda(String endereco, LocalDate date, double valorVenda) {
    super(endereco, date);
    this.valorVenda = valorVenda;
    this.alugado = false;
  }


}
