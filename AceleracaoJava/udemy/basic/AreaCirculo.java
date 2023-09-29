package basic;

import java.util.Scanner;

public class AreaCirculo {

  public static void main(String[] args) {
    double raio, area;
    Scanner scanner = new Scanner(System.in);
    final double pi = 3.14159;

    System.out.println("Informe o raio do circulo: ");
    raio = scanner.nextDouble();

    area = pi * Math.pow(raio, 2);

    System.out.printf("%.4f", area);
    scanner.close();

  }

}
