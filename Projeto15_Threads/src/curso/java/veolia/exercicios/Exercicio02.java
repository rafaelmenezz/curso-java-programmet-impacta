package curso.java.veolia.exercicios;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que solicite nomes para o usuário. Com estes nomes,
		 * realizar um sorteio do modo amigo secreto
		 */

		int quantidade;

		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de participantes: "));

		String[] participantes = new String[quantidade];

		for (int i = 0; i < participantes.length; i++) {
			participantes[i] = JOptionPane.showInputDialog("Insira o nome do " + (i + 1) + "° participante: ");
		}

		Random sorteio = new Random();
		for (int i = 0; i < participantes.length; i++) {
			int indice = sorteio.nextInt(participantes.length);
			String temp = participantes[indice];
			participantes[indice] = participantes[i];
			participantes[i] = temp;
		}

		for (int i = 0; i < participantes.length; i++) {

			JOptionPane.showMessageDialog(null, participantes[i] + " pressione enter para descobrir sua dupla.");
			if (i == participantes.length - 1) {
				JOptionPane.showMessageDialog(null, participantes[0] + "!!!");
			} else {
				JOptionPane.showMessageDialog(null, participantes[i + 1] + "!!!");
			}
		}

	}
}
