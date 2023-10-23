package udemy.set.entities;

public class Aluno {
  private String nome;
  private int numeroMatricula;
  private String curso;

  public Aluno(String nome, int numeroMatricula, String curso) {
    this.nome = nome;
    this.numeroMatricula = numeroMatricula;
    this.curso = curso;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getNumeroMatricula() {
    return numeroMatricula;
  }

  public void setNumeroMatricula(int numeroMatricula) {
    this.numeroMatricula = numeroMatricula;
  }


}
