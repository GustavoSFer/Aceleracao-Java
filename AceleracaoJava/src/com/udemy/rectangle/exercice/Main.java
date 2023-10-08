package com.udemy.rectangle.exercice;

public class Main {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.height = 4.0;
    rectangle.width = 3.0;


    System.out.println(rectangle.area());
    System.out.println(rectangle.perimetro());
    System.out.println(rectangle.diagonal());

  }

}
