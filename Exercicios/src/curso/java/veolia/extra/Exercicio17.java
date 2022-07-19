package curso.java.veolia.extra;

import javax.swing.JOptionPane;

/*
 * 	Se a taxa de juros compostos de uma determinada aplicação vale 1,25% ao mês, calcular a taxa equivalente
 *	em um intervalo de meses fornecido pelo usuário (número de meses). Se um valor de R$1.000,00 for aplicado
 *	com esta taxa, qual será o valor final após um ano?
 */

public class Exercicio17 {

	public static void main(String[] args) {
		
		double capital = 1000.00;
		double taxaJurosComposto = 1.25;
		
		
		int tempo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo em meses"));
		
		double montante = capital* Math.pow((1*taxaJurosComposto), tempo);
		
		JOptionPane.showMessageDialog(null, "Valor: " + montante);
		
	}
}
