package ExercicioAgenda.pessoa;

public class MainAgenda {

  public static void main(String[] args) {
    Agenda agenda = new Agenda();
    agenda.addPessoa("Gustavo");
    agenda.addPessoa("Luiz");
    agenda.addPessoa("Amanda");
    agenda.addPessoa("Felipe");

    System.out.println(agenda.getListaPessoa());

    System.out.println(agenda.posicaoPessoa("Luiz"));
    System.out.println(agenda.posicaoPessoa("Felipe"));
  }

}
