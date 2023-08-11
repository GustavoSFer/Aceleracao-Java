package Bloco3POO.imobiliaria.main;

import java.time.LocalDate;
import Bloco3POO.imobiliaria.imoveis.Aluguel;
import Bloco3POO.imobiliaria.imoveis.Venda;

public class MainImovel {

  public static void main(String[] args) {
    Venda apto1 = new Venda("Rua Consolação, 255", LocalDate.now(), 600000);
    System.out.println("Endereço do apartamento: " + apto1.getEndereco());
    System.out.println("O valor do venda é: R$ " + apto1.getValorVenda());

    Aluguel apto2 = new Aluguel("Rua algusta, 685", LocalDate.now(), 2300);
    System.out.println("Endereço do apartamento: " + apto2.getEndereco());
    System.out.println("O valor do venda é: R$ " + apto2.getValorAluguel());

    apto1.alugar();
    System.out.println("Alugado: " + apto1.isAlugado());

    System.out.println();
    System.out.println("=== Ativando o imovel e alugando ===");
    apto1.ativarImovel();
    apto1.alugar();
    System.out.println("Alugado: " + apto1.isAlugado());

    System.out.println();
    apto2.alugar();
    System.out.println("Alugado: " + apto2.isAlugado());

  }

}
