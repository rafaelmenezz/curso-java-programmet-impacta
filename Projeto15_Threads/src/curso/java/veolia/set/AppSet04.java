
package curso.java.veolia.set;

import java.util.LinkedHashSet;
import java.util.Set;

import classes.Curso;

public class AppSet04 {

	public static void main(String[] args) {
		try {
			Curso c1 = new Curso("Matematica", 100, 1000);
			Curso c2 = new Curso("Analise de Sistemas", 1200, 10000);
			Curso c3 = new Curso("Matematica", 100, 1000);

			Set<Curso> cursos = new LinkedHashSet<Curso>();
			cursos.add(c1);
			cursos.add(c2);
			cursos.add(c3);
			
			
			cursos.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
