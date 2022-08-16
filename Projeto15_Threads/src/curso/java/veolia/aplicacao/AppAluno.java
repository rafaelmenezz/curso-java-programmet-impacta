package curso.java.veolia.aplicacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import curso.java.veolia.classes.Aluno;
import curso.java.veolia.classes.Curso;
import curso.java.veolia.classes.DocumentoCpf;
import curso.java.veolia.enumerados.Sexo;

public class AppAluno {
	public static void main(String[] args) {
		
		Aluno a1;
		try {
			List<Curso> cursos = new ArrayList<Curso>();
			cursos.add(new Curso("Javascript", 40));
			cursos.add(new Curso("Node.js", 60));
			a1 = new Aluno(new DocumentoCpf("12345678901"),
					"Bill Gates",
					30,
					Sexo.MASCULINO,
					"123", cursos);
			
			a1.getCursos().add(new Curso("Java", 200, 10000));
			System.out.println(a1.listarCursos());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
