package curso.java.veolia.aplicacao;

import javax.swing.JOptionPane;

import curso.java.veolia.classes.DocumentoCpf;
import curso.java.veolia.classes.Funcionario;
import curso.java.veolia.enumerados.Sexo;

public class AppFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario
				(new DocumentoCpf("11111111111"), "Jose", 30, Sexo.MASCULINO, "Motorista", 1500);
		JOptionPane.showMessageDialog(null, funcionario);
	}
}
