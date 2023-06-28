package Banco;

import java.util.Scanner;

public class Banco {

  public static void main(String[] args) {
    ContaBancaria obj = new ContaBancaria();
    obj.depositar(25);

    Scanner teclado = new Scanner(System.in);
    System.out.print("Informe seu nome: ");
    String nome = teclado.next();
    System.out.println("Bem vindo " + nome);

    System.out.println("================");

    System.out.print("Informe uma numero: ");
    String numero1 = teclado.next();

    System.out.print("Informe outro numero: ");
    String numero2 = teclado.next();

    int a = Integer.parseInt(numero1);
    int b = Integer.parseInt(numero2);

    int result = a + b;
    System.out.println("A soma é: " + result);


    teclado.close();

  }

}
