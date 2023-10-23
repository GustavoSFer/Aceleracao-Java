package udemy.lambda.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import udemy.lambda.entities.Produto;

public class FunctionProduto {

  public static void main(String[] args) {
    List<Produto> produtos = new ArrayList<>();

    produtos.add(new Produto("Celular", 1500.00));
    produtos.add(new Produto("PC", 2500.00));
    produtos.add(new Produto("Geladeira", 3000.00));
    produtos.add(new Produto("Carregador", 500.00));
    produtos.add(new Produto("Bola", 120.00));
    produtos.add(new Produto("Mouse", 60.00));
    produtos.add(new Produto("Açucar", 12.00));

    // Vamos aprender a função funcion -> Temos que passar dois argumentos e ele irá retornar uma
    // nova lista
    // Com isso usando o "map" para percorrer a nossa lista. OBS: para usar o map precisamos usar em
    // uma stram
    // ou seja, precisamos transformar a nossa lista em stream.

    // 1ª vamos fazer a declaração direto em nosso sistema
    Function<Produto, String> function = p -> p.getNome().toUpperCase();

    // Agora vamos percorrer a nossa lista que precisamos colocar para strem e colocar o nome tudo
    // em maiusculo.
    List<String> nomeMaiusculo = produtos.stream().map(function).collect(Collectors.toList());

    // imprimindo os nomes
    nomeMaiusculo.forEach(System.out::println);

  }

}
