package curso.java.veolia.aplicacao;

import javax.swing.JOptionPane;

import curso.java.veolia.classes.Aluno;
import curso.java.veolia.classes.Curso;
import curso.java.veolia.enumeracoes.Sexo;

public class AppAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Adriana",25,Sexo.FEMININO,1125,new Curso("Angular",64));
				
		JOptionPane.showMessageDialog(null, aluno.getDados());
		JOptionPane.showMessageDialog(null, aluno);
	}
}
