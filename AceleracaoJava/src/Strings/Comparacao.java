package Strings;

public class Comparacao {

  public static void main(String[] args) {
    String nome1 = "Gustavo";
    String nome2 = "Luiz";
    String nome3 = "Gustavo";

    System.out.println(nome1 == nome3);

    // ATENÇÃO: CUIDADO
    // == No Java compara referências de memória ao invés de comparar o texto armazenado no objeto
    // String.
    if (nome1 == nome2) {
      System.out.println("São iguais!");
    } else {
      System.out.println("Diferentes!");
    }

    System.out.println("=============");
    System.out.println();
    if (nome1.equals(nome3)) {
      System.out.println("São iguais!");
    } else {
      System.out.println("Diferentes!");
    }

    System.out.println("=============");
    System.out.println();
    if (nome1.equals(nome2)) {
      System.out.println("São iguais!");
    } else {
      System.out.println("Diferentes!");
    }
  }

}
