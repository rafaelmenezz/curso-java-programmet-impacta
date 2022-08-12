package aplicacao;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Curso;
import classes.DocumentoCpf;
import enumerados.Sexo;

public class AppAluno {
	public static void main(String[] args) {
		
		Aluno a1;
		try {
			a1 = new Aluno(new DocumentoCpf("12345678901"),
					"Bill Gates",
					30,
					Sexo.MASCULINO,
					"123",
					new Curso("MS DOS", 3));
			
			JOptionPane.showMessageDialog(null, a1);

			
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
