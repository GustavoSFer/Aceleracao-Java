package ManipulacaoArquivos;

import java.util.ArrayList;

public class Agenda {
  ArrayList<Pessoa> pessoa;

  public Agenda(String nome, int phone) {
    pessoa.add(new Pessoa(nome, phone));
  }
}
