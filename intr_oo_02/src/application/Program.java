package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner( System.in);
		
		//Crio uma variavél do Product, que está em entities e instancio
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		
		//começo a preencher o atributos da minha classe products
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
		/* Não preciso chamar necessariamente a toString,
		 * pois o programa entende o contexto e já tenta buscar 
		 * um retorno em string. Assim, ele irá encontrar a função 
		 * toString retornando o nome.
		 * System.out.println(product);
		 */		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product.toString());

		
		

		
		
		sc.close();
	}

}
