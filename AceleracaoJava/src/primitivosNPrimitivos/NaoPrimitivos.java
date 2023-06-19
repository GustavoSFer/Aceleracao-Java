package primitivosNPrimitivos;

public class NaoPrimitivos {

	public static void main(String[] args) {
		String frase = "Estou aprendendo ";
		String frase2 = "Java";
		
		System.out.println(frase + frase2);

		frase2 = "C#";
		
		System.out.println(frase + frase2);
		
		System.out.println("==========");
		
		// Arrays
		int[] idade = new int [3];
		idade[0] = 2;
		idade[1] = 5;
		idade[2] = 98;
		
		System.out.println(idade[0]);
		
		// Matriz
		int[][] numero = new int [2][2];
		numero[0][0] = 1;
		numero[0][1] = 3;
		numero[1][0] = 11;
		numero[1][1] = 15;
		//numero[0][0] = 1;
		
		System.out.println(numero[0][0]);
		
		// Iniciando array
		String[] nome = {"Gustavo","Luiz"," Lucas","Pedro"};
		System.out.println(nome[1]);
		System.out.println(nome[0]);
	
		float[] altura = {1.67f, 1.76f};
		System.out.println(altura[0]);
		
	}

}
