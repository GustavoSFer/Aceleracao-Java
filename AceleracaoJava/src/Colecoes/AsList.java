package Colecoes;

import java.util.Arrays;
import java.util.List;

public class AsList {
  public static void main(String[] args) {
    List<String> nomes = Arrays.asList("Will", "Sara", "Deph");

    System.out.println(nomes);

    String[] arrayDeEstudantes = new String[] {"João", "Maria", "Pedro", "Rosa"};
    List<String> estudantes = Arrays.asList(arrayDeEstudantes);

    System.out.println(estudantes);
  }
}
