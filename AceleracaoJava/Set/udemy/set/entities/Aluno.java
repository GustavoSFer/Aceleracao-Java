package udemy.set.entities;

import java.util.Objects;

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

  @Override
  public int hashCode() {
    return Objects.hash(numeroMatricula);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Aluno other = (Aluno) obj;
    return numeroMatricula == other.numeroMatricula;
  }


}
