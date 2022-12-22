package application;

import entities.Product;

import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();

        set.add(new Product("Notebook", 1900.00));
        set.add(new Product("TV", 1800.00));
        set.add(new Product("Tablet", 1200.00));

        Product prod = new Product("TV", 1800.00);
        System.out.println(set.contains(prod));
    }
}