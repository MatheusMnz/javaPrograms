import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Declarar o locale antes da declaração do Scanner
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Lendo String
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);

		// Lendo Inteiro
		int num;
		num = sc.nextInt();
		System.out.println("Você inseriu: " + num);

		// Lendo Float
		double number;
		// Considerar o separador de decimais como ponto ou vírgula
		number = sc.nextDouble();
		System.out.println("Você inseriu: " + number);

		// Lendo um Caracter
		char ch;
		// sc.next() Lê na forma de String e charAt(0) pega o primeiro caracter da
		// String
		ch = sc.next().charAt(0);
		System.out.println("Você digitou: " + ch);
		
		//Lendo string até a quebra de linha
		String s1,s2,s3;
		//Caso use somente next, ele lê somente uma palavra
		// O Enter insere uma quebra de linha que fica pendente e o NextLine
		//acaba lendo esse \n e imprime uma string vazia

		sc.nextLine(); // Para remover o \n. Semelhante ao getchar
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
