package TestCalculadora;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import TestJUnit.Calculadora;

@DisplayName("Realizae teste da nossa classe calculadora!")
class testCalculadora {

  @Test
  @DisplayName("Realizando teste de Somar")
  void testCalculadora() {
    Calculadora conta = new Calculadora();
    assertEquals(12, conta.somar(7, 5));
    assertEquals(9, conta.somar(7, 2));
  }

  @Test
  @DisplayName("Realizando teste de subtrair")
  void testSubtrair() {
    Calculadora sub = new Calculadora();
    assertEquals(7, sub.subtrair(10, 3));
    assertEquals(0, sub.subtrair(100, 100));
    assertEquals(-7, sub.subtrair(-10, 3));
  }

  @Test
  @DisplayName("Realizando teste de Multiplicar")
  void testMultiplicar() {
    Calculadora mult = new Calculadora();
    assertEquals(6, mult.multiplicar(2, 3));
    assertEquals(10, mult.multiplicar(2, 5));
    assertEquals(64, mult.multiplicar(8, 8));
    assertEquals(50, mult.multiplicar(10, 5));
  }


  @Test
  @DisplayName("Realizando teste com booleano")
  void testVerificarDividendo() {
    Calculadora bo = new Calculadora();
    assertTrue(bo.verificarDividendo(5));
    assertFalse(bo.verificarDividendo(0));
  }
}
