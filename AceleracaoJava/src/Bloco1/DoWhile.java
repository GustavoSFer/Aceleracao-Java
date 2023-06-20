package Bloco1;

import java.util.Random;

public class DoWhile {

	public static void main(String[] args) {
		int tentativaMax = 0;
		int atendeu = 0;
		
		do {
			atendeu = new Random().ints(0, 2).findFirst().getAsInt();
			tentativaMax += 1;
			System.out.println("Ligação - tentativa: " + tentativaMax);
		} while (atendeu == 0 && tentativaMax < 3);
		
	}

}
