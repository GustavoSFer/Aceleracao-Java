package Datas;

import java.time.Clock;
import java.time.LocalDateTime;

public class DatasTime {

  public static void main(String[] args) {
    Clock relogio = Clock.systemDefaultZone();

    System.out.println(relogio);
    System.out.println(relogio.instant());
    System.out.println(relogio.getZone());

    // mostra a data e horario atual do dispositivo que esta sendo usado
    LocalDateTime time = LocalDateTime.now();
    System.out.println(time);

  }

}
