package udemy.lambda.application;

import java.util.ArrayList;
import java.util.List;
import udemy.lambda.entities.Produto;

public class BrincandoComListas {

  public static void main(String[] args) {
    List<Produto> produtos = new ArrayList<>();

    produtos.add(new Produto("Celular", 1500.00));
    produtos.add(new Produto("PC", 2500.00));
    produtos.add(new Produto("Geladeira", 3000.00));
    produtos.add(new Produto("Carregador", 500.00));
    produtos.add(new Produto("Bola", 120.00));
    produtos.add(new Produto("Mouse", 60.00));
    produtos.add(new Produto("Açicar", 12.00));

    // Listando nosso produtos em ordem alfabetica
    produtos.sort(new MeuComparador());
    for (Produto p : produtos) {
      System.out.println(p);
    }
  }

}
