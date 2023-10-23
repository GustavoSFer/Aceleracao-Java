package udemy.map.entities;

import java.util.Objects;

public class Candidato {
  private String nome;

  public Candidato(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Candidato other = (Candidato) obj;
    return Objects.equals(nome, other.nome);
  }

}
