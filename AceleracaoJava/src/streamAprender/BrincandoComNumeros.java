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

    System.out.println("\n\n========\nImprimir os elementos em orde crescente");
    // imprimir os elementos em orde crescente
    List<Integer> ordenados = numeros.stream().sorted().collect(Collectors.toList());
    ordenados.stream().forEach(e -> System.out.print(e + ", "));

    System.out.println("\n\n========\nNão mostrar os numeros repetidos");
    // Não mostrar os numeros repetidos
    numeros.stream().distinct().forEach(e -> System.out.print(e + ", "));

    System.out.println("\n\n========\nRealizar o soma dos elementos");
    // Realizar o soma dos elementos
    int soma = numeros.stream().reduce((e, acc) -> acc + e).get();
    System.out.println(soma);


    System.out
        .println("\n\n========\nMostre quantos numeros tem na lista sem numeros repetidos (total)");
    // Mostre quantos numeros tem na lista sem numeros repetidos (total)
    int qtdLista = (int) numeros.stream().distinct().count();
    System.out.println(qtdLista);

    System.out.println("\n\n========\nFiltra os numeros que seja maior que 50");
    // Filtra os numeros que seja maior que 50
    List<Integer> maiorCinquenta =
        numeros.stream().filter(e -> (e > 50)).collect(Collectors.toList());
    maiorCinquenta.stream().forEach(e -> System.out.print(e + ", "));

    System.out.println("\n\n========\nMostre somente os 3 primeiros numeros da lista");
    // Mostre somente os 3 primeiros numeros da lista
    numeros.stream().limit(3).forEach(e -> System.out.println(e));
    // Mostre os 2 ultimos elementos da lista

  }

}
