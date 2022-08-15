package curso.java.veolia.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppSet02 {

public static void main(String[] args) {
		
		Set<String> cidades = new LinkedHashSet<String>();
		
		cidades.add("Blumenau");
		cidades.add("Rio de Janeiro");
		cidades.add("São Paulo");
		cidades.add("Curitiba");
		cidades.add("Porto Feliz");
		cidades.add("Curitiba");
		
		cidades.forEach(System.out::println);
	}
}
