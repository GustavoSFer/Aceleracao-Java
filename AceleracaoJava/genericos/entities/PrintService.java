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
}
