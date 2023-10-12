package com.udemy.entities;

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

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getWidthdrawLimit() {
    return widthdrawLimit;
  }



}
