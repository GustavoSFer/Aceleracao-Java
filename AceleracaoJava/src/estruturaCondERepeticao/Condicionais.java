package estruturaCondERepeticao;

public class Condicionais {

	public static void main(String[] args) {
		double mediaFinal = 6.3;
		
		if (mediaFinal >= 7) {
			System.out.println("Aprovado!");
		} else if (mediaFinal >= 6.0 && mediaFinal < 7.0) {
			System.out.println("Realizar prova Bonus");
		}
		else {
			System.out.println("Reprovado!");
		}

	}

}
