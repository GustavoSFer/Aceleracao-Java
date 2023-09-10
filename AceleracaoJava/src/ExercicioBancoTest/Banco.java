package ExercicioBancoTest;

import java.util.ArrayList;

public class Banco {
  private double valorConta;
  private String nome;
  private String cpf;
  protected ArrayList<String> transacaoTipo;

  public Banco(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
    this.valorConta = 0;
    this.transacaoTipo = new ArrayList<>();
  }

  public double sacar(double valor) {
    if (this.valorConta >= valor) {
      this.valorConta -= valor;
      movimentacao("Sacar");
      return this.valorConta;
    }
    return this.valorConta;
  }

  public double depositar(double valor) {
    movimentacao("Depositar");
    return this.valorConta += valor;
  }

  private void movimentacao(String tipo) {
    this.transacaoTipo.add(tipo);
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
