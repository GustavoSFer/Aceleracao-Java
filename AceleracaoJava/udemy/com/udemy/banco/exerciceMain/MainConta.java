package com.udemy.banco.exerciceMain;

import java.util.Scanner;
import com.udemy.banco.exercice.Conta;

public class MainConta {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double valor = 0;

    System.out.println("Qual o numero da conta");
    int conta = sc.nextInt();
    // Apenas para consumir a linha que ficou pendente do nextInt()
    sc.nextLine();
    System.out.println("Infome o nome do titular: ");
    String nome = sc.nextLine();
    System.out.println("Deseja fazer um deposito inicial? s/n");
    String deposito = sc.nextLine();

    if (deposito.equals("s")) {
      System.out.println("Informe o valor do deposito");
      valor = sc.nextDouble();
    }

    Conta comSaldo = new Conta(conta, nome, valor);
    Conta semSaldo = new Conta(conta, nome);

    System.out.println(comSaldo);
    comSaldo.depositar(500.0);
    System.out.println(comSaldo);
    comSaldo.sacar(100.0);
    System.out.println(comSaldo);



  }

}
