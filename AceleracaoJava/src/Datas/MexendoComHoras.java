package Datas;

import java.time.LocalTime;

public class MexendoComHoras {

  public static void main(String[] args) {
    MexendoComHoras func = new MexendoComHoras();
    func.marcarExtra();
  }

  public void marcarExtra() {
    LocalTime now = LocalTime.now();
    LocalTime extra = LocalTime.parse("17:00:00");

    if (now.isAfter(extra)) {
      System.out.println("Você esta fazendo hora extra!");
    } else {
      System.out.println("Você não está em hora extra.");
    }
  }
}
