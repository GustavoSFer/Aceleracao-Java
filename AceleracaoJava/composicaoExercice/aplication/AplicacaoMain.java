package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import entity.ContratoDeHoras;
import entity.Departamento;
import entity.Profissional;
import entityEnum.NivelProfissional;

public class AplicacaoMain {

  public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Entre com o nome do departamento: ");
    String departamento = sc.nextLine();

    System.out.println("Entre com os dados do profissional");
    System.out.print("Nome: ");
    String nome = sc.nextLine();
    System.out.print("Level: ");
    String level = sc.nextLine();
    System.out.print("Base salarial");
    double salario = sc.nextDouble();

    Profissional profissional = new Profissional(nome, NivelProfissional.valueOf(level), salario,
        new Departamento(departamento));

    System.out.println("Quantos contratos tem o profissional: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.print("Entre com os dado do " + i + "ª contrato: ");
      System.out.print("Data (dd/mm/aaaa) ");
      Date dataContrato = sdf.parse(sc.next());
      System.out.print("valor hora: ");
      double valorHora = sc.nextDouble();
      System.out.print("Duração em horas: ");
      int horas = sc.nextInt();

      ContratoDeHoras contrato = new ContratoDeHoras(dataContrato, valorHora, horas);

      profissional.addContrato(contrato);
    }

    System.out.println();
    System.out.print("Entre com o mês e ano (mm/aaaa) para ver o valor total que ganhou: ");
    String mesEAno = sc.next();
    int mes = Integer.parseInt(mesEAno.substring(0, 2));
    int ano = Integer.parseInt(mesEAno.substring(3));

    System.out.println("Nome: " + profissional.getNome());
    System.out.println("Departamento: " + profissional.getDepartamento().getNome());
    System.out.println("Ganhos no mes/ano: " + profissional.valorGanho(ano, mes));

    sc.close();
  }

}
