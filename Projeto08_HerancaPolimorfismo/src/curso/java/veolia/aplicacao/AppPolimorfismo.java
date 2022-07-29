package curso.java.veolia.aplicacao;

import javax.swing.JOptionPane;

import curso.java.veolia.classes.Funcionario;
import curso.java.veolia.classes.Pessoa;
import curso.java.veolia.enumeracoes.Sexo;

public class AppPolimorfismo {

	public static void main(String[] args) {
		
		Pessoa p1 = new Funcionario();
		
		
		p1.setNome("Jonas");
		p1.setIdade(50);
		p1.setSexo(Sexo.FEMININO);
		
		Funcionario f1 = (Funcionario)p1;
		
		JOptionPane.showMessageDialog(null, p1.getDados());
	}
}
