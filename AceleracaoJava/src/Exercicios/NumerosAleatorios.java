package Exercicios;

import java.util.Random;

public class NumerosAleatorios {
  /**
   * Método principal para a execuçao do código.
   * 
   */
  public static void main(String[] args) {
    int numero = 0;

    while (numero != 4) {
      numero = numeroAleatorio();
      imprime(numero);
    }
  }

  // Chame a função escrevendo `imprime()`.
  static void imprime(int numero) {
    System.out.println(numero);
  }

  // Chame a função escrevendo `numeroAleatorio()`.
  static int numeroAleatorio() {
    return numerosAleatorios.entreUmECinco();
  }

  static NumerosAleatorios numerosAleatorios = new NumerosAleatorios();

  int entreUmECinco() {
    return new Random().nextInt(5) + 1;
  }
}
