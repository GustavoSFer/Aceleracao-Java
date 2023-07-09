package Exercicios;

public class arraySoma {

  public static void main(String[] args) {
    int[] a = {1, 0, 5, -2, -5, 7};
    // int[] b = new int[6]; outra forma de iniciar um array, mas sem os numeros.

    /**
     * Realizando a soma do array
     */
    int soma = 0;
    for (int i = 0; i < a.length; i++) {
      soma += a[i];
    }
    System.out.println("A soma do array é: " + soma);

    // Mudando o valor da posição 4
    a[4] = 100;


  }

}
