package Strings;

import java.util.ArrayList;

public class ListaDeArrays {

  public static void main(String[] args) {
    ArrayList<String> nome;
    nome = new ArrayList<String>();

    nome.add("Amanda");
    nome.add("Pedro");
    nome.add("Lucas");
    nome.add("Mauricio");
    nome.add("Gusta");

    System.out.println(nome);

    String nomes = "Laura,Rojer,Yuri,Renato";

    String[] nomesEmArrays = nomes.split(",");

    // Mostra a memória
    System.out.println(nomesEmArrays);


    System.out.println(nomesEmArrays[0]);

    System.out.println("===========\n");
    for (String n : nomesEmArrays) {
      System.out.println(n);
    }
  }

}
