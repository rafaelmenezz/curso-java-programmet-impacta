package curso.java.veolia.arrays;

import classes.Curso;

public class AppArrays05 {

	public static void main(String[] args) {
		
		try {
			Object[] objetos = {"Livro", new Curso("Java", 140), 120, 135.99, false};
			
			for (var  object : objetos) {
				System.out.println(object);
			}
			
			System.out.println();
			
			for (Object object : objetos) {
				System.out.println(object);
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
