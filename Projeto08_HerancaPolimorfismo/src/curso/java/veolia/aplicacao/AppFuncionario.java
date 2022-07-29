package curso.java.veolia.aplicacao;

import javax.swing.JOptionPane;

import curso.java.veolia.classes.Funcionario;
import curso.java.veolia.enumeracoes.Sexo;

public class AppFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		
		funcionario.setNome("Deobaldo Santos");
		funcionario.setIdade(23);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setCargo("Motorista");
		funcionario.setSalario(5000);
		
		
		JOptionPane.showMessageDialog(null, funcionario.getDados());
	}
	
}
