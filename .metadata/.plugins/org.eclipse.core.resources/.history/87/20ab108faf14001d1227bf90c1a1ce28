package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vetor = new double [n];
		double sum=0;
		double average;

		
		for(int i=0;i<n;i++) {
			vetor[i] = sc.nextDouble();
			sum += vetor[i];
		}
		average = sum/n;
		System.out.println("Average Height: " + average);
		
		sc.close();
	}

}
