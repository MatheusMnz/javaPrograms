package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números serão digitados? ");
		int quantidade = sc.nextInt();
		
		int[] vec = new int [quantidade];
		int cont=0;
		
		for(int i=0; i<vec.length;i++) {
			System.out.print("Digite um número: ");
			vec[i] = sc.nextInt();
			if(vec[i] < 0) {
				cont++;
			}
		}
		
		if(cont > 0) {
			System.out.println("Número Negativos: ");
			for(int i=0; i<vec.length;i++) {
				if(vec[i] < 0) {
					System.out.println(vec[i]);
				}
			}
		}
		
		sc.close();
		
		
	}

}
