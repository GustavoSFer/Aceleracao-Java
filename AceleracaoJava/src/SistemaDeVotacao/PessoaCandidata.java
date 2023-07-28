package SistemaDeVotacao;

public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  public PessoaCandidata(String nome, int numero) {
    super.nome = nome;
    this.numero = numero;
  }

  @Override
  public String getNome() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setNome(String nome) {
    // TODO Auto-generated method stub

  }

}
