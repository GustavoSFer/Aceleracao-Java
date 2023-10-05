package com.udemy.list.exercice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEmployee {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Employee> employees = new ArrayList<>();

    System.out.println("Quantos funcionários deseja cadastrar: ");
    int qtd = sc.nextInt();

    for (int i = 0; i < qtd; i++) {
      System.out.println((i + 1) + "ª Funcionário: ");

      System.out.println("ID: ");
      int id = sc.nextInt();
      System.out.println("Nome: ");
      String nome = sc.next();
      System.out.println("Salario: ");
      double salario = sc.nextDouble();

      employees.add(new Employee(id, nome, salario));
    }

    System.out.println("Informe o id do funcionário que deseja realizar o aumento salarial: ");
    int id = sc.nextInt();

    for (Employee y : employees) {
      if (y.getId() == id) {
        System.out.println("Informe o valor em porcentagem: ");
        int porcentagem = sc.nextInt();
        y.aumentarSalario(porcentagem);
      } else {
        System.out.println("Id não encontrado!");
      }
    }

    System.out.println("Lista dos funcionários:");
    for (Employee y : employees) {
      System.out.println(y.getId() + " " + y.getName() + " " + y.getSalario());
    }

    sc.close();
  }

}
