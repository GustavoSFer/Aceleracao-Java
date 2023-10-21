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
    for (T dado : dados) {
      if (dados.size() > 0) {
        System.out.print(dado + ", ");
      }
    }
    System.out.println("]");
  }
}
