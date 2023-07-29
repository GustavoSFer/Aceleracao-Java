package ManipulacaoArquivos;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcao = 0;

    Agenda agenda = new Agenda();

    while (opcao != 3) {
      System.out.println("=== Escolha uma opção: ===");
      System.out
          .println("1- Adicionar pessoa: \n" + "2- Listar pessoas: \n" + "3- Sair do sistema: ");

      switch (opcao) {
        case 1:
          System.out.println("Infome o nome da pessoa:");
          String nome = scanner.nextLine();
          System.out.println("Informe o Telefone:");
          int phone = scanner.nextInt();

          agenda.addPessoa(nome, phone);
          break;
        case 2:
          break;
        case 3:
          break;
      }
    }

  }

}
