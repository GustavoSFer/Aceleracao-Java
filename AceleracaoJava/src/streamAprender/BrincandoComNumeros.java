package streamAprender;

import java.util.Arrays;
import java.util.List;

public class BrincandoComNumeros {

  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 4, 56, 1, 56, 7, 8, 56, 4);

    numeros.stream().forEach(e -> System.out.println(e));

  }

}
