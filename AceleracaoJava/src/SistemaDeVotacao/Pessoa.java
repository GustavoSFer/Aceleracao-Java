package SistemaDeVotacao;

public abstract class Pessoa {
  private String nome;

  public Pessoa(String nomeObj) {
    this.nome = nomeObj;
  }

  public abstract String getNome();

  public abstract void setNome(String nome);
}
