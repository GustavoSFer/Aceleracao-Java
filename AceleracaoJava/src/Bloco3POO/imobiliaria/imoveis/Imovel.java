package Bloco3POO.imobiliaria.imoveis;

import java.time.LocalDate;

public class Imovel {
  private String endereco;
  private LocalDate date;
  private boolean ativo;

  public Imovel(String endereco, LocalDate date) {
    super();
    this.endereco = endereco;
    this.date = date;
    this.ativo = false;
  }



}
