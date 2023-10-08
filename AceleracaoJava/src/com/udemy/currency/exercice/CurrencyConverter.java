package com.udemy.currency.exercice;

public class CurrencyConverter {

  private static double IOF = 0.06;

  public static double currencyConvert(double dollar, double valor) {
    double valorConvertido = dollar * valor;
    double valorIof = valorConvertido * IOF;
    return valorConvertido + valorIof;
  }

}
