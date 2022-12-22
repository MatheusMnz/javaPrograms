package application;

import entities.Client;

public class Program {
    public static void main(String[] args) {
        Client c1 = new Client("Matheus", "matheus@gmail.com");
        Client c2 = new Client("Matheus", "matheus@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        // Compara as referências de memória
        System.out.println(c1 == c2);

        // O compilador trata a expressão literal de forma especial. O  que não acontece
        // Caso eu fizesse: "String s1 = new String("Test");"
        //                  "String s2 = new String("Test");"

        System.out.println(s1 == s2);
    }
}