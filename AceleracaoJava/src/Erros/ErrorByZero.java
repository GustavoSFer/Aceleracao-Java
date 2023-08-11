package Erros;

public class ErrorByZero {

  public static void main(String[] args) {
    try {
      System.out.println(dividor(10, 2));
      System.out.println(dividor(10, 0));
    } catch (ArithmeticException e) {
      System.out.println("Não é possivel dividir por zero!");
    }

  }

  public static int dividor(int num1, int num2) {
    return num1 / num2;
  }

}
