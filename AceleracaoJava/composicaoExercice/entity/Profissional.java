package entity;

import entityEnum.NivelProfissional;

public class Profissional {
  private String nome;
  private NivelProfissional nivel;
  private double baseSalario;

  public Profissional(String nome, NivelProfissional nivel, double baseSalario) {
    super();
    this.nome = nome;
    this.nivel = nivel;
    this.baseSalario = baseSalario;
  }

  public NivelProfissional getNivel() {
    return nivel;
  }

  public void setNivel(NivelProfissional nivel) {
    this.nivel = nivel;
  }

  public String getNome() {
    return nome;
  }

  public double getBaseSalario() {
    return baseSalario;
  }



}
