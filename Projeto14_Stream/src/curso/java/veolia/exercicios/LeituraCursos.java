package curso.java.veolia.exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import classes.Curso;

public class LeituraCursos {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("/home/jonathan.albuquerque/Documentos/emilio/cursos.csv");
			BufferedReader buffer = new BufferedReader(reader);
			
			List<Curso> cursos = new ArrayList<Curso>();
			
			while(true) {
				String linha = buffer.readLine();
				if(linha == null || linha.trim().length() == 0) {
					break;
				}
				String[] itens = linha.split(";");
				Curso c1 = new Curso(itens[0],
						Integer.parseInt(itens[1]),
						Double.parseDouble(itens[2]));
				cursos.add(c1);
			}
			
			buffer.close();
			reader.close();
			
			cursos.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
