package com.udemy.list.exercice;

public class Employee {
  private int id;
  private String name;
  private double salario;

  /**
   * Construtor padrão
   */
  public Employee() {}

  /**
   * Construtor com todos os atributos
   * 
   * @param id
   * @param name
   * @param salario
   */
  public Employee(int id, String name, double salario) {
    this.id = id;
    this.name = name;
    this.salario = salario;
  }

}
