package udemy.lambda.application;

import java.util.Comparator;
import udemy.lambda.entities.Produto;

public class MeuComparador implements Comparator<Produto> {

  @Override
  public int compare(Produto p1, Produto p2) {
    return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
  }

}
