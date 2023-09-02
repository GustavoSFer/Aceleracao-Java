package TestJUnit;

public class Calculadora {
  private float resultado;

  public float somar(float n1, float n2) {
    resultado = n1 + n2;
    return resultado;
  }

  public float subtrair(float n1, float n2) {
    return n2 - n1;
  }

  public float multiplicar(float n1, float n2) {
    resultado = n1 * n2;
    return resultado;
  }
}
