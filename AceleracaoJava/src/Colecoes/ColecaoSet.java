package Colecoes;

import java.util.TreeSet;

public class ColecaoSet {

  public static void main(String[] args) {
    var numeros = new TreeSet<Integer>();

    numeros.add(1);
    numeros.add(2);
    numeros.add(1);
    numeros.add(3);
    numeros.add(3);
    numeros.add(7);

    System.out.println(numeros);

  }

}
