package udemy.map.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import udemy.map.entities.Candidato;

public class Application {

  public static void main(String[] args) {
    Map<Candidato, Integer> candidatos = new HashMap<>();
    Scanner sc = new Scanner(System.in);


    System.out.println("Informe o caminho do arquivo: ");
    String path = sc.next();
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
