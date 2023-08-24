package Datas;

import java.time.LocalDate;

public class AnoBissexto {

  public static void main(String[] args) {
    AnoBissexto biss = new AnoBissexto();
    System.out.println(biss.isBissexto("2024-01-01"));
  }

  public boolean isBissexto(String ano) {
    LocalDate data = LocalDate.parse(ano);

    return data.isLeapYear();
  }

}
