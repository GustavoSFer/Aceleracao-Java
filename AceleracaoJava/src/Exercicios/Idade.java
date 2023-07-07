package Exercicios;

import java.util.Scanner;

public class Idade {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual o seu nome: ");
    String nome = scanner.next();

    System.out.println("Qual a sua idade: ");
    int idade = (int) scanner.nextInt();

    scanner.close();

    if (idade < 18) {
      System.out.println(nome + " você é menor de idade!");
    } else {
      System.out.println(nome + " você é maior de idade!!!");
    }
  }

}
