package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import entitiesEnum.OrderStatus;

public class Order {
  private Date data;
  private OrderStatus status;
  private List<OrderItem> itens = new ArrayList<>();
  private Client cliente;

  public Order(Date data, OrderStatus status, Client cliente) {
    this.data = data;
    this.status = status;
    this.cliente = cliente;
  }

  public void addItem(OrderItem item) {
    this.itens.add(item);
  }

  public void removeItem(OrderItem item) {
    this.itens.remove(item);
  }

  public double total() {
    double soma = 0;
    for (OrderItem item : itens) {
      soma += item.subtotal();
    }
    return soma;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public List<OrderItem> getItens() {
    return itens;
  }

  public void setItens(List<OrderItem> itens) {
    this.itens = itens;
  }

  public Client getCliente() {
    return cliente;
  }

  public void setCliente(Client cliente) {
    this.cliente = cliente;
  }

}
