package curso.java.veolia.leitura;

import javax.swing.JOptionPane;

public class LeituraGrafica {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Seu nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Sua idade: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: "));
		
		
		JOptionPane.showMessageDialog(null, new StringBuilder().append("Nome informado: ")
																.append(nome)
																.append("\nIdade informada: ")
																.append(idade)
																.append("\nAltura informada: ")
																.append(altura)
																.toString()
																, "Resposta", JOptionPane.ERROR_MESSAGE);
	}
	
	
}
