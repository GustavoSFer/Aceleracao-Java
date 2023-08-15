package Colecoes;

import java.util.HashMap;

public class Agenda {
  private final HashMap<String, String> contatos = new HashMap<String, String>();

  public void cadastrarPessoa(String nome, String telefone) {
    contatos.put(nome, telefone);
  }

  public void excluirContato(String nome) {
    this.contatos.remove(nome);
  }

  public String retornaTelefone(String nome) {
    return this.contatos.get(nome);
  }

  public int tamanhoAgenda() {
    return this.contatos.size();
  }

}
