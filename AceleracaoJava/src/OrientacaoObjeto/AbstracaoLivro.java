package OrientacaoObjeto;

public class AbstracaoLivro {
  private String nome;
  private int numeroPagina;

  AbstracaoLivro(String nome, int pagina) {
    this.nome = nome;
    this.numeroPagina = pagina;
  }

  public String getNome() {
    return this.nome;
  }

  public int getNumeroDePaginas() {
    return this.numeroPagina;
  }
}
