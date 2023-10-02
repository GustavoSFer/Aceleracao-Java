package com.udemy.banco.exerciceMain;

import com.udemy.banco.exercice.Conta;

public class MainConta {

  public static void main(String[] args) {
    Conta comSaldo = new Conta(514, "Gustavo Frederico", 11500.00);
    Conta semSaldo = new Conta(514, "Luiz Guilherme");

    System.out.println(comSaldo);
    comSaldo.depositar(500.0);
    System.out.println(comSaldo);
    comSaldo.sacar(11500.0);
    System.out.println(comSaldo);

    System.out.println();
    System.out.println(semSaldo);
    semSaldo.depositar(500.0);
    System.out.println(semSaldo);
    semSaldo.sacar(500.0);
    System.out.println(semSaldo);



  }

}
