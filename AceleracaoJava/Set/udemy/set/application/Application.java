package udemy.set.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import udemy.set.entities.Aluno;

public class Application {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Set<Aluno> alunos = new HashSet<Aluno>();

    System.out.print("Quantos anulos para o curso A: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.print("Nome do aluno: ");
      String nome = sc.next();
      System.out.print("Número da matricula: ");
      int matricula = sc.nextInt();
      Aluno aluno = new Aluno(nome, matricula, "A");
      alunos.add(aluno);
    }

    System.out.print("Quantos anulos para o curso B: ");
    n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.print("Nome do aluno: ");
      String nome = sc.next();
      System.out.print("Número da matricula: ");
      int matricula = sc.nextInt();
      Aluno aluno = new Aluno(nome, matricula, "A");
      alunos.add(aluno);
    }

    System.out.print("Quantos anulos para o curso C: ");
    n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.print("Nome do aluno: ");
      String nome = sc.next();
      System.out.print("Número da matricula: ");
      int matricula = sc.nextInt();
      Aluno aluno = new Aluno(nome, matricula, "A");
      alunos.add(aluno);
    }

    System.out.print("Quantos alunos matriculados nos cursos: " + alunos.size());
    sc.close();
  }

}
