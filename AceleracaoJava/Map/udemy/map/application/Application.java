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
      String line = br.readLine();
      while (line != null) {
        String[] urna = line.split(" ");
        String nome = urna[0];
        int votos = Integer.parseInt(urna[1]);

        Candidato candidato = new Candidato(nome);

        if (candidatos.containsKey(candidato)) {
          int votosComputados = candidatos.get(candidato);
          candidatos.put(candidato, votos + votosComputados);
        } else {
          candidatos.put(candidato, votos);
        }

        line = br.readLine();
      }

      for (Candidato key : candidatos.keySet()) {
        System.out.println(key.getNome() + " " + candidatos.get(key));
      }

    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
