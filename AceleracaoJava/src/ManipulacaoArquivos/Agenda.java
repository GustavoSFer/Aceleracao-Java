package ManipulacaoArquivos;

import java.util.ArrayList;

public class Agenda {
  private ArrayList<Pessoa> pessoas;

  public Agenda() {
    this.pessoas = new ArrayList<Pessoa>();
  }

  public void addPessoa(Pessoa pessoa) {
    this.pessoas.add(pessoa);
  }

  public void listarAgenda() {
    System.out.println("=== Listar Pessoas ===");
    for (Pessoa pessoa : pessoas) {
      System.out.println(pessoa.getNome() + " - " + pessoa.getPhone());
    }
    System.out.println("   -----------   ");
  }
}
