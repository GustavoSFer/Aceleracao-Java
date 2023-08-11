package Bloco3POO.imobiliaria.imoveis;

import java.time.LocalDate;

public class Imovel {
  private String endereco;
  private LocalDate date;
  protected boolean ativo;

  public Imovel(String endereco, LocalDate date) {
    super();
    this.endereco = endereco;
    this.date = date;
    this.ativo = false;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public boolean isAtivo() {
    return ativo;
  }

  public void ativarImovel() {
    this.ativo = true;
  }



}
