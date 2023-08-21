package streamAprender;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ApiStream {

  public static void main(String[] args) {
    Collection<Estudante> entrada = obterEntrada();
    List<Integer> numeros = Arrays.asList(1, 3, 4, 56, 7, 8, 8, 9, 6);

    numeros.stream().forEach(e -> System.out.println(e));
    entrada.stream().forEach(e -> System.out.println(e.getNome()));

    List<String> matriculas =
        entrada.stream().filter(e -> "Ciência da Computação".equals(e.getCurso()))
            .sorted(Comparator.comparing(Estudante::getNome)).map(Estudante::getMatricula)
            .collect(Collectors.toList());
    System.out.println(matriculas);

    List<String> nome = entrada.stream().filter(e -> "Gustavo Fernandes".equals(e.getNome()))
        .sorted(Comparator.comparing(Estudante::getNome)).map(Estudante::getNome)
        .collect(Collectors.toList());

    System.out.println(nome);
  }

  public static Collection<Estudante> obterEntrada() {
    return Set.of(new Estudante("1104", "Gustavo Fernandes", "Ciência da Computação"),
        new Estudante("1004", "Luiz Felipe", "Administração"));
  };

}
