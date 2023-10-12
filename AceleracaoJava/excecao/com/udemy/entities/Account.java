package com.udemy.entities;

import com.udemy.exceptions.widthdrawException;

public class Account {
  private int number;
  private String holder;
  private double balance;
  private double widthdrawLimit;

  public Account(int number, String holder, double balance, double widthdrawLimit) {
    this.number = number;
    this.holder = holder;
    this.balance = balance;
    this.widthdrawLimit = widthdrawLimit;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public double getBalance() {
    return balance;
  }

  public double getWidthdrawLimit() {
    return widthdrawLimit;
  }

  public void deposit(double value) {
    this.balance += value;
  }

  public void widthdraw(double value) throws widthdrawException {
    if (value > this.widthdrawLimit) {
      throw new widthdrawException("Saque maior do que o valor limite diario!");
    }
    if (value > this.balance) {
      throw new widthdrawException("Saldo insuficiente!");
    }
    this.balance -= value;
  }

}
