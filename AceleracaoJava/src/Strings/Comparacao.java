package Strings;

public class Comparacao {

  public static void main(String[] args) {
    String nome1 = "Gustavo";
    String nome2 = "Luiz";
    String nome3 = "Gustavo";

    System.out.println(nome1 == nome2);

    if (nome1 == nome2) {
      System.out.println("São iguais!");
    } else {
      System.out.println("Diferentes!");
    }

  }

}
