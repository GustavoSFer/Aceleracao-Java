package aplication;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.ProductImport;
import entities.ProdutoHeran;
import entities.usedProduct;

public class MainHeran {

  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    // SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Scanner sc = new Scanner(System.in);
    List<ProdutoHeran> listaProdutos = new ArrayList<>();

    System.out.print("Quantos produtos deseja cadastrar? ");
    int n = sc.nextInt();

    System.out.println();
    System.out.println("C - Comun\nU - Usado\nI - Importado");

    for (int i = 1; i <= n; i++) {
      System.out.println("Entre com o tipo de produto (c/u/i)");
      char opcao = sc.next().charAt(0);

      System.out.print("Nome: ");
      String nomeProduto = sc.next();
      sc.next();
      System.out.print("Price: ");
      double price = sc.nextDouble();

      if (opcao == 'c') {
        listaProdutos.add(new ProdutoHeran(nomeProduto, price));
      } else if (opcao == 'u') {
        System.out.print("Data de valide (dd/mm/aaaa): ");

        LocalDate validade = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        listaProdutos.add(new usedProduct(nomeProduto, price, validade));
      } else {
        System.out.println("Taxa personalizada: ");
        double taxa = sc.nextDouble();
        listaProdutos.add(new ProductImport(nomeProduto, price, taxa));
      }
    }

    System.out.println();
    System.out.println("PRICE TAG: ");
    for (ProdutoHeran p : listaProdutos) {
      System.out.println(p.priceTag());
    }

    sc.close();
  }

}
