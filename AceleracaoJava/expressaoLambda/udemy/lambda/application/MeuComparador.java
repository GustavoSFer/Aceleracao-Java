package udemy.lambda.application;

import java.util.Comparator;
import udemy.lambda.entities.Produto;

/**
 * Criando uma classe de comparação que implementa de Comparator, para passarmos o objeto um e
 * comparar com o objeto 2 assim retornando valor 0 se for igual (int)
 */
public class MeuComparador implements Comparator<Produto> {

  @Override
  public int compare(Produto p1, Produto p2) {
    return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
  }

}
