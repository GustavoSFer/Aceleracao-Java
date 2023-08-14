package Colecoes;

import java.util.HashMap;

public class MapComoFunciona {

  public static void main(String[] args) {
    var estudantes = new HashMap<String, String>();

    estudantes.put("tarmaA", "Jão");
    estudantes.put("TurmaB", "MairaRosa");

    System.out.println(estudantes);

    estudantes.put("tarmaA", "Aurelina");
    System.out.println(estudantes);
  }

}
