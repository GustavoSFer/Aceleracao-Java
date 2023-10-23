package udemy.lambda.application;

import java.util.ArrayList;
import java.util.Comparator;
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
    produtos.add(new Produto("Açucar", 12.00));

    // Listando nosso produtos em ordem alfabetica
    // produtos.sort(new MeuComparador()); // Comentando 1ª Caso de como ser feito
    /**
     * Esta é uma forma de fazer a comparação. Criando uma classe que implementa de
     * Comparator<Classe que desejamos comparar> e assim no programa principal instanciamos essa
     * nossa classe de comparação
     * 
     * A outra forma de fazer, é fazer a implementação do Comparator direto no nosso sistema
     * principal. Conforme exemplo abaixo:
     */

    /*
     * Comparator<Produto> comparador = new Comparator<Produto>() {
     * 
     * @Override public int compare(Produto o1, Produto o2) { return
     * o1.getNome().toUpperCase().compareTo(o2.getNome().toUpperCase()); } };
     * 
     * produtos.sort(comparador);
     */

    /**
     * Vamos agora para a nossa 3ª opção de realizar e dessa forma, agora usando as expressões
     * lambdas
     */

    Comparator<Produto> comparator = (p1, p2) -> {
      return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
    };

    produtos.sort(comparator);

    // Outra forma de fazer e direto no nosso sort ficando assim a nossa 4ª forma de fazer.
    produtos.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));


    for (Produto p : produtos) {
      System.out.println(p);
    }
  }

}
