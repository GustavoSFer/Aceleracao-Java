package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
  private int quantity;
  private double price;

  private List<Product> produtos = new ArrayList<>();

  public OrderItem(int quantity, double price) {
    this.quantity = quantity;
    this.price = price;
  }

  public double subtotal() {
    return quantity * price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public List<Product> getProdutos() {
    return produtos;
  }



}
