package com.udemy.employee.exercice;

public class Employee {
  public String name;
  public double glossSalary;
  public double tax;

  public double netSalary() {
    return this.glossSalary - this.tax;
  }

  public void increaseSalary(double procentagem) {
    double aumento = this.glossSalary * procentagem / 100;
    this.glossSalary += aumento;
  }

}
