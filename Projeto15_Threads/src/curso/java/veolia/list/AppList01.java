package curso.java.veolia.list;

import java.util.ArrayList;
import java.util.List;

public class AppList01 {

	public static void main(String[] args) {
		
		List<String> cursos = new ArrayList<String>();

		cursos.add("Java Programmer");
		cursos.add("PHP");
		cursos.add("Scrum Master");
	
		
		System.out.println(cursos);
		
		cursos.add(0, "SQL");
		cursos.add("Cloud Computing");
		cursos.add(1, "DevOps");
		cursos.add("DevOps");

		
		System.out.println(cursos.toString());
		
		System.out.println();
		System.out.println("Com foreach padrão: ");
		for (String curso : cursos) {
			System.out.println(curso);
		}
		
		cursos.remove("PHP");
		cursos.removeIf(s -> s.endsWith("s"));
		
		System.out.println();
		System.out.println("Com foreach funcional: ");
		cursos.forEach(s -> System.out.println(s));
		
		
	}
}
