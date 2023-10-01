package com.udemy.employee.exercice;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Employee pessoa = new Employee();

    System.out.print("Informe seu nome:");
    pessoa.name = sc.nextLine();

    System.out.println();
    System.out.print("Informe seu salario:");
    pessoa.glossSalary = sc.nextDouble();

    System.out.println();
    System.out.print("Informe o valor de desconto:");
    pessoa.tax = sc.nextDouble();


    sc.close();
  }

}
