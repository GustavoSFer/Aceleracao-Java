package Datas;

import java.time.Duration;
import java.time.LocalDateTime;

public class QtdDiaNascimento {

  public static void main(String[] args) {
    QtdDiaNascimento paulinho = new QtdDiaNascimento();

    System.out.println(paulinho.calcularDiasNascimento("2023-08-20T12:45:00"));

  }

  public long calcularDiasNascimento(String dataNascimento) {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime nascimento = LocalDateTime.parse(dataNascimento);

    Duration dias = Duration.between(nascimento, now);
    return dias.toDays();
  }
}
