package com.udemy.matriz.exercice;

import java.util.Scanner;

public class MatrizExercice {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantos numeros terá a matriz: ");
    int qtd = sc.nextInt();
    int[][] mat = new int[qtd][qtd];

    for (int i = 0; i < mat.length; i++) {
      System.out.println("Informe " + (i + 1) + "ª linha: ");
      for (int j = 0; j < mat.length; j++) {
        mat[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat.length; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("numeros diagonais: ");
    for (int i = 0; i < mat.length; i++) {
      System.out.print(mat[i][i] + " ");
    }
    sc.close();

  }

}
