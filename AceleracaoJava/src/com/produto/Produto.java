package com.produto;

public class Produto {
  private String name;
  private double price;
  private int quantity;

  public double totalValueStock() {
    return price * quantity;
  }

  public void addProduct(int quantity) {
    this.quantity += quantity;
  }

  public void removeProduct() {
    this.quantity -= quantity;
  }

}
