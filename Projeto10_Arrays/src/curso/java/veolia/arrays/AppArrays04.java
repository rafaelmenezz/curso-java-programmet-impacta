package curso.java.veolia.arrays;

import static javax.swing.JOptionPane.showInputDialog;

import java.util.Arrays;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;


import classes.Curso;

public class AppArrays04 {

	public static void main(String[] args) {
		
		int quantidade = parseInt(showInputDialog("Quantidade de cursos: "));
		
		Curso[] cursos = new Curso[quantidade];
		
		for (int i = 0; i < cursos.length; i++) {
			String descricao = showInputDialog("Descrição " + (i+1) + ": ");
			int ch = parseInt(showInputDialog("Carga horária " + (i+1) + ": "));
			double preco = parseDouble(showInputDialog("Preço" + (i+1) + ": "));
			
			cursos[i] = new Curso(descricao, ch, preco);
		}
		Arrays.sort(cursos);
		for (Curso curso : cursos) {
			System.out.println(curso);
		}
		
	}
}
