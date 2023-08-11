package ExercicioAgenda.pessoa;

import java.util.ArrayList;

public class Agenda extends Pessoa {

  private ArrayList<String> listaPessoa = new ArrayList<String>();

  public void addPessoa(String nome) {
    listaPessoa.add(nome);
  }

  public ArrayList<String> getListaPessoa() {
    return this.listaPessoa;
  }

  public int posicaoPessoa(String nome) {
    int index = listaPessoa.indexOf(nome);
    return index;
  }

}
