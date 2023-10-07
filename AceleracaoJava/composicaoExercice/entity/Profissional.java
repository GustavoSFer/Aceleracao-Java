package entity;

import java.util.ArrayList;
import java.util.List;
import entityEnum.NivelProfissional;

public class Profissional {
  private String nome;
  private NivelProfissional nivel;
  private double baseSalario;

  // Composição - Um profissional tem um Departamento
  private Departamento departamento;
  // Um profissional pode ter varioas contratos;
  private List<ContratoDeHoras> contratoDeHoras = new ArrayList<>();

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
