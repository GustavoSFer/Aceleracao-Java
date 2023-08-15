package Colecoes;

public class AgendaComMap {

  public static void main(String[] args) {
    Agenda ag = new Agenda();

    ag.cadastrarPessoa("Gustavo", "11-112458744");
    System.out.println(ag.retornaTelefone("Gustavo"));

    ag.excluirContato("Gustavo");
    System.out.println(ag.retornaTelefone("Gustavo"));

  }

}
