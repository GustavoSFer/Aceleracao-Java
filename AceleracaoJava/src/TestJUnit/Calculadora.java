package TestJUnit;

public class Calculadora {
  private float resultado;

  public float somar(float n1, float n2) {
    resultado = n1 + n2;
    return resultado;
  }

  public float subtrair(float n1, float n2) {
    float positivoOuNegativo = Math.signum(n1);
    if (Math.signum(n1) == -1 || Math.signum(n2) == -1) {
      resultado = (n1) + (n2);
      return resultado;
    }
    return n1 - n2;
  }

  public float multiplicar(float n1, float n2) {
    resultado = n1 * n2;
    return resultado;
  }
}
