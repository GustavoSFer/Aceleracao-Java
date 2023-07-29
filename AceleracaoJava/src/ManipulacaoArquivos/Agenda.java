package ManipulacaoArquivos;

import java.util.ArrayList;

public class Agenda {
  private ArrayList<Pessoa> pessoas;

  public void addPessoa(String nome, int phone) {
    pessoas.add(new Pessoa(nome, phone));
  }

  public void listarAgenda() {
    System.out.println("=== Listar Pessoas ===");
    for (Pessoa pessoa : pessoas) {
      System.out.println(pessoa.getNome() + " - " + pessoa.getPhone());
    }
    System.out.println("   -----------   ");
  }
}
