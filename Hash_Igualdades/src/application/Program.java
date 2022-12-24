package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;
import entities.Product_treeSet;

// Como as Coleções Hash testam igualdade:

// Se HashCode e equals estiverem implementados: 1º HashCode, se der igual,
// usa equals para confirmar. (String, Double, etc. já possuem implementado).

// Senão,
// Compara as refências (ponteiros) dos objetos


public class Program {
	public static void main(String[] args) {
		
		// HashSet
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Tablet", 500.0));
		set.add(new Product("Notebook", 1200.0));
		
		Product prod = new Product("Notebook", 1200.0);
		System.out.println(set.contains(prod));
		
		
		// ThreeSet (Classe tem de ser implementação do Comparable)
		Set<Product_treeSet> set2 = new TreeSet<>();
		
		set2.add(new Product_treeSet("TV", 900.0));
		set2.add(new Product_treeSet("Tablet", 500.0));
		set2.add(new Product_treeSet("Notebook", 1200.0));
		
		for(Product_treeSet p : set2) {
			System.out.println(p);
		}
	}

}
