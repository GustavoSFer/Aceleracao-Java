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

  public void aumentarSalario(int porcentagem) {
    this.salario += this.salario * porcentagem;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalario() {
    return this.salario;
  }

  public int getId() {
    return id;
  }

}
