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

  public String toString() {
    StringBuilder str = new StringBuilder();
    str.append("Order Summary: \n");
    str.append("Order moment " + this.data + "\n");
    str.append("Name: " + this.cliente.getName() + ", (" + this.cliente.getBirthDate() + ") "
        + ", email: " + this.cliente.getEmail() + "\n");
    str.append("Oder Items: \n");

    for (OrderItem item : itens) {
      str.append(item.toString() + "\n");
    }

    str.append("Total order value: $: " + this.total());

    return str.toString();
  }

}
