package curso.java.veolia.exercicios;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class CaixaEletronico01 {
	public static void main(String[] args) {

		
		double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Valor do saque: "));
		int valor = (int) valorSaque;
		
		if (valor % 5 != 0) {
			JOptionPane.showMessageDialog(null, "Valor inválido para saque");
			return; // funciona do método, no caso método principal, main
		}
		
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
