import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

  public static void main(String[] args) {
    String path =
        "C:\\Users\\Gamer\\git\\Aceleracao-Java\\AceleracaoJava\\leituraDeArquivos\\nomes.txt";
    // FileReader fr = null;
    // BufferedReader br = null;

    /**
     * Neste caso vamos instancia o nosso objeto FileReader e o BufferedReader dentro do nosso bloco
     * Try Desta forma ele mesmo se carregar para fechar os arquivos, e não precismos se preocupar.
     * Vou deixar comentado o que não precismos para este caso.
     */
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      // fr = new FileReader(path);
      // br = new BufferedReader(fr);

      // Faz a leitura da linha
      String line = br.readLine();

      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
      // } finally {
      // // Neste caso precisamos fechar os dois arquivos que abrimos o fileReader e o
      // BufferedReader e
      // // ele pode dar erro para fechar algum
      // // então neste caso precimos colocar eles dentro de um bloco try para caso der erro em
      // algum,
      // // conseguirmos tratar ele.
      // try {
      // if (fr != null) {
      // fr.close();
      // }
      // if (br != null) {
      // br.close();
      // }
      // } catch (IOException e) {
      // System.out.println("Algo de erro para fechar um dos arquivos");
      // e.printStackTrace();
      // }

      // }

    }
  }

}
