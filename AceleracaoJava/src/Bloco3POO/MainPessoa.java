package Bloco3POO;

public class MainPessoa {

  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("Gustavo", "123.456.789-01", 32);

    System.out.println("O nome do objeto pessoa1 é: " + pessoa1.getNome());
    System.out.println("O CPF do objeto pessoa1 é: " + pessoa1.getCpf());
    System.out.println("A idade do objeto pessoa1 é: " + pessoa1.getIdade());

    System.out.println("=== Fazendo alteraçoes ===");

    // Mudando o nome
    pessoa1.setNome("Gustavo Fernandes");
    System.out.println("O nome do objeto pessoa1 é: " + pessoa1.getNome());
  }

}
