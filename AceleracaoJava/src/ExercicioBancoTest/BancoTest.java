package ExercicioBancoTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Realizae teste da nossa classe Banco!")
class testBanco {

  @Test
  @DisplayName("Instaciando a classe Banco e seu metodo construtor")
  void testBanco() {
    Banco banco = new Banco("Gustavo", "16548548");

    assertEquals("Gustavo", banco.getNome());
    assertTrue(new Banco("Gustavo", "16548548") instanceof Banco);
    assertEquals("16548548", banco.getCpf());
  }

  @Test
  @DisplayName("Verifica o metodo sacar sem ter dinheiro. espero retornar o dinheiro que tenho atual. No caso 0")
  void testBancoSacar() {
    Banco banco = new Banco("Teste", "46516548");
    double valor = banco.sacar(10);

    assertEquals(0, valor);
  }

  @Test
  @DisplayName("Verifica o metodo depositar.")
  void testBancoDepositar() {
    Banco banco = new Banco("Teste", "46516548");
    double valor = banco.depositar(1000);

    assertEquals(1000, valor);
  }

  @Test
  @DisplayName("Verifica o metodo Movimentacao.")
  void testBancoMovimentacao() {
    Banco banco = new Banco("Teste", "46516548");
    double valorD = banco.depositar(1000);
    double valorS = banco.sacar(150);

    assertEquals(2, banco.transacaoTipo.size());
    assertTrue(banco.transacaoTipo.contains("Depositar"));
  }

  @Test
  @DisplayName("Verifica Get nome.")
  void testBancoGetNome() {
    Banco banco = new Banco("Teste", "46516548");

    assertEquals("Teste", banco.getNome());
  }

  @Test
  @DisplayName("Verifica o gte valor conta.")
  void testBancoGetValorConta() {
    Banco banco = new Banco("Teste", "46516548");
    banco.depositar(100);

    assertEquals(100, banco.getValorConta());
  }

  @Test
  @DisplayName("Verifica o get cpf.")
  void testBancoGetCpf() {
    Banco banco = new Banco("Teste", "46516548");

    assertEquals("46516548", banco.getCpf());
  }
}
