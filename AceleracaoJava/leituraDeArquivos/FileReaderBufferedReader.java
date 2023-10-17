import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferedReader {

  public static void main(String[] args) {
    // Outra forma de fazer a leituro do arquivo usando o fileReader e o BufferReader
    String path =
        "C:\\Users\\Gamer\\git\\Aceleracao-Java\\AceleracaoJava\\leituraDeArquivos\\nomes.txt";
    FileReader fr = null;
    BufferedReader br = null;

    try {
      fr = new FileReader(path);
      br = new BufferedReader(fr);

      // Faz a leitura da linha
      String line = br.readLine();

      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      // Neste caso precisamos fechar os dois arquivos que abrimos o fileReader e o BufferedReader e
      // ele pode dar erro para fechar algum
      // então neste caso precimos colocar eles dentro de um bloco try para caso der erro em algum,
      // conseguirmos tratar ele.
      try {
        if (fr != null) {
          fr.close();
        }
        if (br != null) {
          br.close();
        }
      } catch (IOException e) {
        System.out.println("Algo de erro para fechar um dos arquivos");
        e.printStackTrace();
      }

    }

  }

}
