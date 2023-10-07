package entity;

import java.util.ArrayList;
import java.util.Calendar;
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

  public Profissional(String nome, NivelProfissional nivel, double baseSalario,
      Departamento departamento) {
    super();
    this.nome = nome;
    this.nivel = nivel;
    this.baseSalario = baseSalario;
    this.departamento = departamento;
  }

  public void addContrato(ContratoDeHoras contrato) {
    contratoDeHoras.add(contrato);
  }

  public void removerContrato(ContratoDeHoras contrato) {
    contratoDeHoras.remove(contrato);
  }

  public double valorGanho(int ano, int mes) {
    double soma = baseSalario;
    Calendar cal = Calendar.getInstance();
    for (ContratoDeHoras c : contratoDeHoras) {
      cal.setTime(c.getDate());
      int c_ano = cal.get(Calendar.YEAR);
      int c_mes = 1 + cal.get(Calendar.MONTH); // mês começa com o 0 até 11.
      if (c_ano == ano && c_mes == mes) {
        soma += c.totalValor();
      }
    }
    return soma;
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

  public Departamento getDepartamento() {
    return departamento;
  }

}
