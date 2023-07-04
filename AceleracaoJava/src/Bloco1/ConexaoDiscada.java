package Bloco1;

import java.util.Random;

/**
 * Classe ConexaoDiscada.
 *
 */
public class ConexaoDiscada {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    int count = 0;

    while (count < 3) {
      if (conexaoDiscada.conectou()) {
        break;
      }
      count++;
    }
  }

  // Chame esta função escrevendo `conectou()`
  static boolean conectou() {
    return conexaoDiscada.verdadeiroOuFalso();
  }

  static ConexaoDiscada conexaoDiscada = new ConexaoDiscada();

  // Retorna verdadeiro ou falso
  boolean verdadeiroOuFalso() {
    return new Random().nextInt(2) == 1;
  }

}
