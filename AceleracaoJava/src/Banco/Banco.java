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

    teclado.close();

  }

}
