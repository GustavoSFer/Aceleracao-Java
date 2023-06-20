package Bloco1;

public class For {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("=====================");
		
		String[] alunos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA" };
		String log;
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i] +" - Matricula: " + i);
		}
		
		System.out.println("=====================");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}

	}

}
