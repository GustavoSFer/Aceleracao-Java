package com.produto;

import java.util.Scanner;

public class MainProduct {

  public static void main(String[] args) {
    Produto produto = new Produto();
    produto.name = "TV";
    produto.price = 1500;
    produto.quantity = 10;

    Scanner sc = new Scanner(System.in);

    System.out.println("Product data: " + produto.name + ", $" + produto.price + " "
        + produto.quantity + ", units, total: $ " + produto.totalValueStock());

    System.out.println("Adicionar produto: informe a quantidade: ");
    produto.addProduct(sc.nextInt());
    System.out.println("Update data: " + produto.name + ", $" + produto.price + " "
        + produto.quantity + " units, total: $ " + produto.totalValueStock());

    System.out.println("Remover produto: informe a quantidade: ");
    produto.removeProduct(sc.nextInt());
    System.out.println("Update data: " + produto.name + ", $" + produto.price + " "
        + produto.quantity + " units, total: $ " + produto.totalValueStock());

    sc.close();

  }

}
