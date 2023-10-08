package AplicationOrder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entitiesEnum.OrderStatus;

public class MainProgram {

  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    try {
      System.out.println("Entrer client data");
      System.out.print("Name: ");
      String name = sc.nextLine();
      System.out.print("E-mail: ");
      String email = sc.nextLine();
      System.out.print("Birth date (DD/MM/YYYY): ");

      Date dataAniversario = (Date) sdf.parse(sc.nextLine());

      Client client = new Client(name, email, dataAniversario);

      System.out.println("Enter order data: ");
      System.out.print("status: ");
      OrderStatus status = OrderStatus.valueOf(sc.nextLine());

      Order order = new Order(new Date(), status, client);

      System.out.print("How many items to this order? ");
      int qtd = sc.nextInt();

      for (int i = 0; i < qtd; i++) {
        System.out.print("Product name: ");
        String productName = sc.nextLine();
        System.out.print("Product price: ");
        double price = sc.nextDouble();
        System.out.println("Quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(productName, price);
        OrderItem orderItem = new OrderItem(quantity, price, product);

        order.addItem(orderItem);
      }

      System.out.println(order);

    } catch (ParseException e) {
      System.out.println("Valor informado não encontrado!");
    }

  }

}
