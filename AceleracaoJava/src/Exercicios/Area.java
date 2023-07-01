package Exercicios;

import java.util.Scanner;

public class Area {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite a medida do lado do quadrado:");
    double lado = teclado.nextDouble();
    double area = lado * lado;

    System.out.println("A area do quadrado de lado " + lado + " é igual a " + area);
    teclado.close();
  }

}
