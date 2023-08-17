package streamAprender;

import java.util.Collection;
import java.util.Set;

public class ApiStream {

  public static void main(String[] args) {

  }

  public static Collection<Estudante> obterEntrada() {
    return Set.of(new Estudante("1104", "Gustavo Fernandes", "Ciência da Computação"),
        new Estudante("1004", "Luiz Felipe", "Administração"));
  };

}
