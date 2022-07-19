package curso.java.veolia.extra;

import javax.swing.JOptionPane;

/*
 * 	Escrever um programa que considere uma variável inteira, cujo valor é fornecido pelo usuário, e mostre sua
 *	representação binária (32 bits). 
 */

public class Exercicio15 {
	public static void main(String[] args) {
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
		char bin = (char) valor;
		
		JOptionPane.showMessageDialog(null, bin);
		
	}
}
