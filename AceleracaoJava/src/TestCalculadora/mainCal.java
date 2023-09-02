package TestCalculadora;

import TestJUnit.Calculadora;

public class mainCal {

  public static void main(String[] args) {
    Calculadora sub = new Calculadora();
    System.out.println(sub.subtrair(-10, 3));
    System.out.println(sub.subtrair(10, -3));
    System.out.println(sub.dividir(3, 0));

  }

}
