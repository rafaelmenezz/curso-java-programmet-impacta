package curso.java.veolia.aplicacao;

import javax.swing.JOptionPane;

import curso.java.veolia.classes.Funcionario;
import curso.java.veolia.enumeracoes.Sexo;

public class AppFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Deobaldo Santos",23,Sexo.MASCULINO,"Motorista",5000);
		
		
		JOptionPane.showMessageDialog(null, funcionario.getDados());
	}
	
}
