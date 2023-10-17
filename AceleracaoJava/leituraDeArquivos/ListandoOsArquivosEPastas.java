import java.io.File;
import java.util.Scanner;

public class ListandoOsArquivosEPastas {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe um caminho: ");
    String caminho = sc.nextLine();

    File path = new File(caminho);
    // Vamos ver todos as pasta que vão estar no caminho informado
    File[] pastas = path.listFiles(File::isDirectory);

    // Imprimindo todos as pastas
    System.out.println("Imprimiando somente as pastas: ");
    for (File pasta : pastas) {
      System.out.println(pasta);

    }
    System.out.println();
    // Imprimindo somente os arquivos
    File[] arquivos = path.listFiles(File::isFile);
    System.out.println("Imprimindo somente os arquivos");
    for (File arquivo : arquivos) {
      System.out.println(arquivo);
    }

    System.out.println();

    // Vamos criar uma pasta dentro do caminho informado
    boolean isSuccess = new File(path + "\\Novo-arquivo").mkdir();

    if (isSuccess) {
      System.out.println("Pasta criando com sucesso!");
    }

    sc.close();
  }

}
