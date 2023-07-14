package Bloco3POO.imobiliaria.main;

import java.time.LocalDate;
import Bloco3POO.imobiliaria.imoveis.Venda;

public class MainImovel {

  public static void main(String[] args) {
    Venda apto1 = new Venda("Rua Consolação, 255", LocalDate.now(), 600000);
    System.out.println("Endereço do apartamento: " + apto1.getEndereco());
    System.out.println("O valor do venda é: R$ " + apto1.getValorVenda());

  }

}
