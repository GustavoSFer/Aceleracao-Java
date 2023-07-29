package ManipulacaoArquivos;

public class Pessoa {
  private String nome;
  private int phone;

  public Pessoa(String nome, int phone) {
    this.nome = nome;
    this.phone = phone;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getPhone() {
    return this.phone;
  }

  public void setPhone(int phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return this.nome + " - " + this.phone;
  }
}
