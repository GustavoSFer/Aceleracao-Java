package application;

import java.util.Scanner;
import entities.PrintService;

public class aplicacao {

  public static void main(String[] args) {
    PrintService<String> printService = new PrintService<String>();
    Scanner sc = new Scanner(System.in);
    System.out.print("Entre com a quantidade de dados que deseja cadastrar: ");
    Integer n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      String dadoDigitado = sc.next();
      printService.addDado(dadoDigitado);
    }

    printService.print();

    sc.close();
  }

}
