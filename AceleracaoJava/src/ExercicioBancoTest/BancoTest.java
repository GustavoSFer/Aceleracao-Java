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

}
