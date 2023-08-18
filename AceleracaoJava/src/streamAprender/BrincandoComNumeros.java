package streamAprender;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BrincandoComNumeros {

  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 4, 56, 1, 56, 7, 8, 56, 4);
    // Imprimindo cada elemento da nossa lista
    numeros.stream().forEach(e -> System.out.print(e + ", "));

    System.out.println("\n\n========\nImprimir somente os elementos pares da nossa lista");
    // Imprimir somente os elementos pares da nossa lista
    List<Integer> pares = numeros.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
    pares.stream().forEach(e -> System.out.print(e + ", "));

    // imprimir os elementos em orde crescente

    // Não mostrar os numeros repetidos

    // Realizar o soma dos elementos

  }

}
