package com.udemy.rectangle.exercice;

public class Rectangle {
  public double height, width;

  public double area() {
    return this.height * this.width;
  }

  public double perimetro() {
    double P = 2 * (width + height);
    return P;
  }

  public double diagonal() {
    double d = Math.pow(this.height, 2) + Math.pow(width, 2);
    d = Math.sqrt(d);
    return d;
  }
}
