package com.udemy.currency.exercice;

import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("What is the dollar price? ");
    double price = sc.nextDouble();

    System.out.println("How many dollars will be bought?");
    double bought = sc.nextDouble();

    System.out.printf("Amout to be paidin reais = %.2f",
        CurrencyConverter.currencyConvert(price, bought));


    sc.close();
  }

}
