package Bloco1;

public class While {

	public static void main(String[] args) {
		String[] inscritos = {"Pedro", "Amanda", "Bruna", "Celia", "Gustavo", "Mauricio", "Ivone", "Bruna C.", "Paula", "Luiz", "Ricardo", "Arlindo", "Bruno", "Cesar", "Gustavo F"};
		final int numeroVagas = 10;
		String[] vagas = new String[numeroVagas];
		
		int vagaAtual = 0;
		String inscrito = "indefinido";
		
		while (vagaAtual < numeroVagas) {
			inscrito = inscritos[vagaAtual];
			System.out.println("Parabens, " + inscrito + " você ficou na posição " + (vagaAtual + 1));
			vagas[vagaAtual] = inscrito;
			vagaAtual++;
		}
	}

}
