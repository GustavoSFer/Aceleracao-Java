package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
  private List<T> dados = new ArrayList<T>();

  public PrintService() {}

  public List<T> getDados() {
    return dados;
  }

  public void addDado(T dado) {
    dados.add(dado);
  }

  public void print() {
    System.out.print("[");
    if (!dados.isEmpty()) {
      System.out.print(dados.get(0));
    }

    for (int i = 1; i < dados.size(); i++) {
      System.out.print(", " + dados.get(i));
    }

    System.out.println("]");
  }
}
