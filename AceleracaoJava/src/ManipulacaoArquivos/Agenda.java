package ManipulacaoArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Agenda {
  private ArrayList<Pessoa> pessoas;
  File contatoBanco;

  private static final String caminhoArquivo = "C:\\contato\\banco.txt";

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
    try {
      FileReader lerArquivo = null;
      BufferedReader bufferLer = null;

      if (contatoBanco.exists()) {
        lerArquivo = new FileReader(contatoBanco);
        bufferLer = new BufferedReader(lerArquivo);

        String conteudoLinha = bufferLer.readLine();

        System.out.println();
        System.out.println("=== Listar Pessoas ===");
        while (conteudoLinha != null) {
          System.out.println(conteudoLinha);
          conteudoLinha = bufferLer.readLine();
        }
        System.out.println("   -----------   ");
        lerArquivo.close();
        bufferLer.close();
      }
    } catch (Exception e) {
      System.out.println(e);
      e.printStackTrace();
    }

  }

  public void excluirArquivo() {
    try {
      if (contatoBanco.exists()) {
        contatoBanco.delete();
        System.out.println("Arquivo de contatos deletado com sucesso!");
      } else {
        System.out.println("Não existe arquivo para ser deletado!");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
