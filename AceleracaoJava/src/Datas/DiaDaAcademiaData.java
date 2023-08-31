package Datas;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class DiaDaAcademiaData {

  public static void main(String[] args) {
    DiaDaAcademiaData verAcademia = new DiaDaAcademiaData();
    verAcademia.QualDiaDaAcademia();

  }

  public void QualDiaDaAcademia() {
    LocalDateTime agora = LocalDateTime.now();

    if (agora.getDayOfWeek() == DayOfWeek.MONDAY) {
      System.out.println("Hoje é dia de academia. Bora treinar!");
    } else if (agora.getDayOfWeek() == DayOfWeek.SUNDAY) {
      System.out.println("Hoje é dia de academia. Bora treinar!");
    } else if (agora.getDayOfWeek() == DayOfWeek.FRIDAY) {
      System.out.println("Hoje é dia de academia. Bora treinar!");
    } else {
      System.out.println("Hoje não é dia de treino. Bom descanço");
    }
  }

}
