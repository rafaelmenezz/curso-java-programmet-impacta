package curso.java.veolia.extra.poo.exercicio18;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome(JOptionPane.showInputDialog("Informe o nome"));
		funcionario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade")));
		funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário:")));
		funcionario.setCargo(JOptionPane.showInputDialog("informe o cargo"));
		
		funcionario.imprimaDados();
	}
}
