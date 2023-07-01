package OrientacaoObjeto;

public class Abstracao {

  public static void main(String[] args) {
    AbstracaoLivro livro1 = new AbstracaoLivro("Código limpo", 358);
    System.out.println("O titulo do livro1 é: " + livro1.getNome());
    System.out.println("O livro tem " + livro1.getNumeroDePaginas() + " paginas!");

  }

}
