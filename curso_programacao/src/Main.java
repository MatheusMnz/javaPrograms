//Importando a classe
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double value = 10.37373;
		String nome = "Maria";
		int age = 31;
		
		System.out.println("Olá mundo");
		System.out.println(value);
		System.out.printf("%.2f\n", value);
		//Setando o meu Idioma para Inglês parar trocar a virgula por ponto
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f\n", value);
		//Concatenando
		System.out.println("Result = " + value + " points");
		System.out.printf("My names is %s and i have %d years!", nome, age);
		
	}

}
