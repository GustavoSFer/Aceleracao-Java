package TestCalculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import TestJUnit.Calculadora;

class testCalculadora {

  @Test
  void testCalculadora() {
    Calculadora conta = new Calculadora();
    assertEquals(12, conta.somar(7, 5));
    assertEquals(9, conta.somar(7, 2));
  }

  void testSubtrair() {
    Calculadora sub = new Calculadora();
    assertEquals(7, sub.subtrair(10, 3));
  }

}
