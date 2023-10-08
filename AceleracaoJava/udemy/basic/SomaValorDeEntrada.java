package basic;

import java.util.Scanner;

public class SomaValorDeEntrada {

  public static void main(String[] args) {
    int a, b;
    double soma;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe os dois valores: ");
    a = scanner.nextInt();
    b = scanner.nextInt();
    soma = a + b;

    System.out.println("SOMA = " + soma);
    scanner.close();

  }

}
