package ManipulacaoArquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Agenda {
  private ArrayList<Pessoa> pessoas;
  File contatoBanco;

  private static final String caminhoArquivo =
      "C:\\Users\\Gamer\\OneDrive\\Área de Trabalho\\contatos\banco.txt";

  public Agenda() {
    this.pessoas = new ArrayList<Pessoa>();
    this.contatoBanco = new File(caminhoArquivo);
  }

  public void addPessoa(Pessoa pessoa) {
    try {
      FileWriter escreverNoArquivo = null;
      BufferedWriter escritor = null;
      
      if (!this.contatoBanco.exists()) {
        this.contatoBanco.createNewFile();
      }
      
    } catch() {
      
    }
   
  }

  public void listarAgenda() {
    System.out.println();
    System.out.println("=== Listar Pessoas ===");
    for (Pessoa pessoa : pessoas) {
      System.out.println(pessoa.getNome() + " - " + pessoa.getPhone());
    }
    System.out.println("   -----------   ");
    System.out.println();
  }
}
