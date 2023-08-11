package Erros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ErrorEmArquivos {

  public static void main(String[] args) {
    String caminho = "C:\\contato/file.txt";
    try {
      escreverNoArquivo(caminho);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Deu ruim");
    }


  }

  public static void escreverNoArquivo(String caminhoArquivo) throws IOException {
    File meuArquivo = new File(caminhoArquivo);

    FileWriter escritor = null;
    BufferedWriter bufferEscritor = null;

    if (!meuArquivo.exists()) {
      meuArquivo.createNewFile();
    }

  }

}
