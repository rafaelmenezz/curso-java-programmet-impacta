package curso.java.veolia.aplicacao;

import javax.swing.JOptionPane;

import curso.java.veolia.classes.Aluno;
import curso.java.veolia.classes.Curso;
import curso.java.veolia.classes.Funcionario;
import curso.java.veolia.classes.Pessoa;
import curso.java.veolia.enumeracoes.Sexo;

public class AppPolimorfismo {

	public static void main(String[] args) {
		
		Pessoa p1 = new Funcionario("Jonas",50,Sexo.MASCULINO, "Padeiro",3000);
		JOptionPane.showMessageDialog(null, p1.getDados());
		
		
		Funcionario f1 = (Funcionario)p1;
		f1.setCargo("Padeiro Master");

		Aluno a1 = (Aluno)p1;
		a1.setCurso(new Curso("Java ",100));
		
	}
}
