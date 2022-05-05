package br.com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Lena");
		palavras.add("Marisa");
		palavras.add("Edmilson");
		palavras.add("Daniel");
		palavras.add("Isa");


		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.sort(Comparator.comparing(s -> s.length()));
		

		palavras.sort(Comparator.comparing(String :: length));
		
		Function<String, Integer> funcao = String :: length;
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		System.out.println(palavras);

		Consumer<String> imprissor = System.out::println;
		
		palavras.forEach(imprissor);
		
		palavras.forEach(System.out::println);

	}

}
