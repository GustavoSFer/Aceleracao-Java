package com.udemy.banco.exercice;

public class Conta {
  private int numeroConta;
  private String nome;
  private double saldo;

  /**
   * Método construtor com deposito inicial.
   * 
   * @param numero
   * @param nome
   * @param valor a ser depositado inicialmente.
   */
  public Conta(int numero, String nome, double valor) {
    this.numeroConta = numero;
    this.nome = nome;
    this.saldo = valor;
  }

  /**
   * Método construtor sem deposito inical. Saldo iniciando com 0.
   * 
   * @param numero
   * @param nome
   */
  public Conta(int numero, String nome) {
    this.numeroConta = numero;
    this.nome = nome;
  }
}
