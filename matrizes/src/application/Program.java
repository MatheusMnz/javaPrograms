package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Lines: ");
		int m = sc.nextInt();
		System.out.print("Columns: ");
		int n = sc.nextInt();
		
		int[][] mtr = new int[m][n];
		System.out.println("Insert Values: ");
	
		
		//Fill Matrix
		for(int i=0; i<mtr.length;i++) {
			for(int j=0; j < mtr[i].length; j++) {
				mtr[i][j] = sc.nextInt();
			}
		}
		
		//Value in matrix
		System.out.print("Number in Matrix: ");
		int x = sc.nextInt();
		
		
		for (int i=0; i<mtr.length; i++) {
			for (int j=0; j<mtr[i].length; j++) {
				if (mtr[i][j] == x) {
					System.out.println();
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mtr[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mtr[i-1][j]);
					}
					if (j < mtr[i].length-1) {
						System.out.println("Right: " + mtr[i][j+1]);
					}
					if (i < mtr.length-1) {
						System.out.println("Down: " + mtr[i+1][j]);
					}
				}
			}
		}
		
		
		
		sc.close();
	}

}
