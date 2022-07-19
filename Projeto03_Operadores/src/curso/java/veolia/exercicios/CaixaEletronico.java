package curso.java.veolia.exercicios;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

	/*
	 * E um caixa eletronico as cédulas disponíveis são;
	 * 
	 * - R$ 50,00
	 * - R$ 20,00
	 * - R$ 10,00
	 * - R$  5,00
	 * 
	 * Escrever o programa de forma que solicite ao usuário o valor
	 * do saque e apresente a quantidade  de cada cédula, levando em 
	 * conta a menor quantidade possível.
	 *  
	 */

public class CaixaEletronico {
	public static void main(String[] args) {

		
		double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Valor do saque: "));
		int valor = (int) valorSaque;
		
		int q50,q20,q10,q5;
		q50 = q20 = q10 = q5 = 0;
		
		q50 = valor/50;
		valor %= 50;
		
		q20 = valor/20;
		valor %= 20;
		
		q10 = valor/10;
		valor %= 10;
		
		q5 = valor/5;
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		
		String resposta = new StringBuilder()
				.append("Valor do saque: ")
				.append(nf.format(valorSaque))
				.append("\nNotas de 50: ").append(q50)
				.append("\nNotas de 20: ").append(q20)
				.append("\nNotas de 10: ").append(q10)
				.append("\nNotas de 5: ").append(q5)
				.toString();
		
		JOptionPane.showMessageDialog(null, resposta, "Saque", JOptionPane.INFORMATION_MESSAGE);
	}
}
