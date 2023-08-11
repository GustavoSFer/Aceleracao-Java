package Exercicios;

import java.util.Scanner;

public class DobroDoVetor {

  public static void main(String[] args) {
    int[] numeros = new int[6];
    int[] novoNumeros = new int[6];

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 6; i++) {
      System.out.println("Informe o " + (i + 1) + "º numero: ");
      numeros[i] = scanner.nextInt();
    }

    for (int i = 0; i < 6; i++) {
      novoNumeros[i] = numeros[i] * 2;
    }

    for (int numero : novoNumeros) {
      System.out.println(numero);
    }

  }

}
