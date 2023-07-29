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

      escreverNoArquivo = new FileWriter(contatoBanco, true);
      escritor = new BufferedWriter(escreverNoArquivo);

      escritor.write(pessoa.toString());
      escritor.newLine();
      escritor.flush();

      escreverNoArquivo.close();
      escritor.close();

      this.pessoas.add(pessoa);

    } catch (Exception e) {
      System.out.println(e);
      e.printStackTrace();
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
