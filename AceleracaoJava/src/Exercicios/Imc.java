package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Imc {
  /**
   * Projeto imc.
   */
  public static void main(String[] args) {
    // Ler a entrada de um número pelo console
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite o peso:");
    float peso = scan.nextFloat();

    System.out.println("Digite a aultura:");
    float altura = scan.nextFloat();

    // Seu código aqui
    double imcSemArredondar = peso / Math.pow(altura, 2);

    double imc = Math.round(imcSemArredondar * 100000.0) / 100000.0;

    scan.close();

    // Imprime a saída no console. OBS: descomente a próxima linha
    System.out.println(imc);
  }

}
