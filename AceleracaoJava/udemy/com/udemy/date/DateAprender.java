package com.udemy.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAprender {

  public static void main(String[] args) {
    // Mostrando a hora atual do pc.
    LocalDateTime agora = LocalDateTime.now();
    System.out.println(agora);

    // mostrando somente a data atual
    LocalDate data = LocalDate.now();
    System.out.println(data);

    // Formatando a data padrão ISO para o Brasileiro
    DateTimeFormatter brasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.println(data.format(brasil));

    // pegando somente o ano / mês / dia
    System.out.println(data.getYear());
    System.out.println(data.getMonth()); // escrito o mes
    System.out.println(data.getMonthValue()); // pegando o valor numerico do mes
    System.out.println(data.getDayOfMonth());

  }

}
