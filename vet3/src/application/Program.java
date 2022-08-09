package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos pessoas serão cadastradas? ");
		int value = sc.nextInt();
		sc.nextLine();
		int[] idades = new int[value];
		String[] nomes = new String[value];
		int maior = 0;
		
		for(int i=0; i<value; i++) {
			System.out.print("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.print("Digite a idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			idades[i] = idade;
			nomes[i] = nome;
		}
		
		for(int i=0; i<value;i++) {
			if(idades[i] > maior) {
				maior = i;
			}
		}
		
		System.out.println("A pessoa mais velha é: " + nomes[maior]);
		
		sc.close();
	}

}
