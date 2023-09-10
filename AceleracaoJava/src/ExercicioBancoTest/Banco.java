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
}
