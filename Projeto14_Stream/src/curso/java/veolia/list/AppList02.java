package curso.java.veolia.list;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class AppList02 {
	public static void main(String[] args) {
		
		List<String> cursos = new ArrayList<String>();

		cursos.add("Java Programmer");
		cursos.add("PHP");
		cursos.add("Scrum Master");
			
		cursos.add(0, "SQL");
		cursos.add("Cloud Computing");
		cursos.add(1, "DevOps");
		
		Collections.sort(cursos);
		cursos.forEach(s -> System.out.println(s));
		
		System.out.println("-----------------------");
		
		Predicate<String> letraA = nomevariavel -> nomevariavel.contains("a");
		
		cursos.stream().filter(s -> s.endsWith("r")).forEach(System.out::println);
		
		Function<Integer, String> dinheiro = valoraleatorio -> NumberFormat.getCurrencyInstance().format(valoraleatorio) ; 
		int x =10;
		System.out.println(dinheiro.apply(x));
		
		
		
	
	}
}
