package udemy.lambda.application;

import java.util.ArrayList;
import java.util.List;
import udemy.lambda.entities.Produto;

public class ForeachProduto {

  public static void main(String[] args) {
    List<Produto> produtos = new ArrayList<>();

    produtos.add(new Produto("Celular", 1500.00));
    produtos.add(new Produto("PC", 2500.00));
    produtos.add(new Produto("Geladeira", 3000.00));
    produtos.add(new Produto("Carregador", 500.00));
    produtos.add(new Produto("Bola", 120.00));
    produtos.add(new Produto("Mouse", 60.00));
    produtos.add(new Produto("Açucar", 12.00));

    // Vamos atualizar em 10% o preço do nosso produto
    // Para isso usamos a interface Consumer. Vamos usar o for each para percorrer o elemento e
    // fazer essa atualização de 10%

    produtos.forEach(p -> p.setPreco(p.getPreco() * 1.1));

    // Imprimindo a nossa lista usando o foreach támabem
    produtos.forEach(System.out::println);

  }

}
