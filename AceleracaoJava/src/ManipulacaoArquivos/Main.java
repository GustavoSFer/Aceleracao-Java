package ManipulacaoArquivos;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcao = 0;

    Agenda agenda = new Agenda();

    while (opcao != 4) {
      System.out.println("=== Escolha uma opção: ===");
      System.out.println("1- Adicionar pessoa: \n" + "2- Listar pessoas: \n"
          + "3- Deletar arquivo\n" + "4- Sair do sistema: ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          System.out.println("Infome o nome da pessoa:");
          String nome = scanner.next();

          System.out.println("Informe o Telefone:");
          String phone = scanner.next();

          agenda.addPessoa(new Pessoa(nome, phone));;
          break;
        case 2:
          agenda.listarAgenda();
          break;
        case 3:
          agenda.excluirArquivo();
          break;
        case 4:
          System.out.println("Tchau! Até mais. :D");
          break;
      }
    }

  }

}
