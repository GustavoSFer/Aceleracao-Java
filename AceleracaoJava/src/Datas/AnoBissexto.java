package Datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AnoBissexto {

  public static void main(String[] args) {
    AnoBissexto biss = new AnoBissexto();
    System.out.println(biss.isBissexto(2024));

    System.out.println(biss.proximoAnoBissexto("01/01/2021"));

    biss.adicionarAnos(10);
  }

  public boolean isBissexto(int ano) {
    String dataFormatadaISO = ano + "-01-01";
    LocalDate data = LocalDate.parse(dataFormatadaISO);

    return data.isLeapYear();
  }

  public int proximoAnoBissexto(String data) {
    String formatoData = "dd/MM/yyyy";
    DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern(formatoData);
    LocalDate dataformatada = LocalDate.parse(data, dataFormatada);

    while (!dataformatada.isLeapYear()) {
      dataformatada = dataformatada.plusYears(1);
    }
    return dataformatada.getYear();
  }

  public void adicionarAnos(int anos) {
    LocalDate now = LocalDate.now();

    System.out.println(now.plusYears(anos));
  }

}
