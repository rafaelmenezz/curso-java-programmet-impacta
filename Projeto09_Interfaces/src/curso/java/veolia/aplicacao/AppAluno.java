package curso.java.veolia.aplicacao;

import javax.swing.JOptionPane;

import curso.java.veolia.classes.Aluno;
import curso.java.veolia.classes.Curso;
import curso.java.veolia.classes.DocumentoCpf;
import curso.java.veolia.enumeracoes.Sexo;

public class AppAluno {
	public static void main(String[] args) {
		Aluno aluno = new Aluno(new DocumentoCpf("12345678901"), "Bill Gates", 30, Sexo.MASCULINO, 123, new Curso("MS Dos", 80));
		
		JOptionPane.showMessageDialog(null, aluno.getDados());
	}
}
