package aplicacao;

import javax.swing.JOptionPane;

import classes.DocumentoCpf;
import classes.Funcionario;
import enumerados.Sexo;

public class AppFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario
				(new DocumentoCpf("11111111111"), "Jose", 30, Sexo.MASCULINO, "Motorista", 1500);
		JOptionPane.showMessageDialog(null, funcionario);
	}
}
