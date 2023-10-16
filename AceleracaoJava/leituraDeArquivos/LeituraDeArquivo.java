import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeituraDeArquivo {

  public static void main(String[] args) {
    // Vamos instanciar o file e colocar o caminho de onde esta o nosso arquivo .txt
    File file = new File(
        "C:\\Users\\Gamer\\git\\Aceleracao-Java\\AceleracaoJava\\leituraDeArquivos\\nomes.txt");

    // Vamos instanciar o Scanner e chamar o nosso arquivo dentro dele
    Scanner sc = null;

    // Ao tentar abrir o nosso arquivo, ele pode dar erro, então vamos colocar dentro de um bloco
    // try catch para tratar o erro.
    try {
      sc = new Scanner(file);
      // Vamos percorrer o arquivo e verificar se existe a proxima linha e imprimir a linha.
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      // Vamos fechar o Scanner caso ele tenha sido aberto
      if (sc != null) {
        sc.close();
      }
    }
  }

}
