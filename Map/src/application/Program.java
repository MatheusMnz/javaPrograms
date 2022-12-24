package application;

import java.util.Map;
import java.util.TreeMap;

// Coleção de pares chave/valor
// Não admite repetições do objeto chave
// indexados pelas chaves

// Principais implementações:
// 		HashMap: O(1) em tabela Hash e não ordenado
//		TreeMap: O(Log(N)) em árvore rubro negra e ordenado (CompareTo || Comparator)
//		LinkedHashMap: Velocidade Intermed. e elementos na ordem em que são adicionados

// Usos Comuns:
// cookies, local storage, qualquer modelo chave-valor


public class Program {
	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "991927234");
		
		// Removo a entrada que contém essa key
		cookies.remove("email");
		
		// Sobreescreve o valor anterior
		cookies.put("phone", "9923991233");
		
		System.out.println("Contais 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES: ");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
