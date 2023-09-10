package ExercicioBancoTest;

public class Banco {
  private double valorConta;
  private String nome;
  private String cpf;

  public Banco(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
    this.valorConta = 0;
  }

  public double getValorConta() {
    return valorConta;
  }

  public void setValorConta(double valorConta) {
    this.valorConta = valorConta;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
