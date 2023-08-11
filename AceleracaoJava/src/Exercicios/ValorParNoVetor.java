package Exercicios;

import java.util.Scanner;

public class ValorParNoVetor {

  public static void main(String[] args) {
    int[] numeros = new int[6];
    int count = 0;

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 6; i++) {
      System.out.println("Informe o " + (i + 1) + "º numero: ");
      numeros[i] = scanner.nextInt();
    }

    for (int numero : numeros) {
      if (numero % 2 == 0) {
        count++;
      }
    }

    System.out.println("Existe " + count + " numeros pares no vetor!");

  }

}
