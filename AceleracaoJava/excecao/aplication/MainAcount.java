package aplication;

import com.udemy.entities.Account;
import com.udemy.exceptions.widthdrawException;

public class MainAcount {

  public static void main(String[] args) {
    Account conta1 = new Account(8021, "Conta de teste", 500, 500);

    try {
      // Sacando um valor possivel
      conta1.widthdraw(350);
      System.out.println(conta1.getBalance());

      // Sacando um dinheiro acima do limite diario
      // conta1.widthdraw(550);

      // Sacando um dinheiro sem saldo suficiente
      conta1.widthdraw(450);

    } catch (widthdrawException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

}
