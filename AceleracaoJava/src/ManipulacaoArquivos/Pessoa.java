package ManipulacaoArquivos;

public class Pessoa {
  private String nome;
  private String phone;

  public Pessoa(String nome, String phone) {
    this.nome = nome;
    this.phone = phone;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return this.nome + " - " + this.phone;
  }
}
