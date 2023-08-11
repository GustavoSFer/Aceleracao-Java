package Bloco1;

public class Fatorial {
  /**
   * Fatorial em java.
   */
  public static void main(String[] args) {
    long fatorial18 = 1L;

    for (int i = 1; i <= 18; i++) {
      fatorial18 = fatorial18 * i;
    }
    // Imprime a saída no console. OBS: descomente a próxima linha
    System.out.println("O fatorial de 18 é igual a " + fatorial18);

  }

}
