package Colecoes;

import java.util.HashMap;

public class Agenda {
  private final HashMap<String, String> contatos = new HashMap<String, String>();

  public void cadastrarPessoa(String nome, String telefone) {
    contatos.put(nome, telefone);
  }

}
