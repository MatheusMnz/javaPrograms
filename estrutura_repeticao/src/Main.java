import java.util.Scanner;
import java.util.Locale;

//Aprendendo a usar o Debug do Eclipse.
public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroquadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroquadrado;

		System.out.printf("Area: %.2f e Preço: %.2f", area, preco);

		sc.close();
	}

}
