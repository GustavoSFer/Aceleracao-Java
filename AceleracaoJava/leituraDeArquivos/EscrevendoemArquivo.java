import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoemArquivo {

  public static void main(String[] args) {
    // Vamos criar um array de nomes
    String[] nomes = new String[] {"Pedro", "Amanda", "Luiz", "Gustavo"};
    String path =
        "C:\\\\Users\\\\Gamer\\\\git\\\\Aceleracao-Java\\\\AceleracaoJava\\\\leituraDeArquivos\\\\out.txt";

    // Vamos instanciar o nosso FileWriter e o BufferedWriter, ja utilizando o nosso try with
    // resource
    // try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
    // COLOCANDO O TRUE DEPOIS DO CAMINHO ESTAMOS INFORMANDO PARA SEMPRE ACRESCENTAR NO ARQUIVO. E
    // NO FORMA DE CIMA (SEM O TRUE) ELE SEMPRE CRIA UM NOVO ARQUIVO
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
      for (String nome : nomes) {
        bw.write(nome);
        // Criando uma nova linha
        bw.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
