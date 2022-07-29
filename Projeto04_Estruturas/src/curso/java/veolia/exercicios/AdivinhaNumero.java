package curso.java.veolia.exercicios;

import java.util.Random;

import javax.swing.JOptionPane;

/*
 *  O programa gera um número aleatório entre 1 e 100.
 *  Iterativamente, o usuário tenta adivinhar o número.
 *  
 *  Com o exemplo, suponha que tenha sido gerado o numero 45.
 *  
 *  Em termos de execução, considere o seguinte processo:
 *  
 *  Programa: "Informe um valor entre 1 e 100"
 *  Usuário: 60
 *  Programa: "Informe um valor entre 1 e 59"
 *  Usuário: 20
 *  Programa: "Informe um valor entre 21 e 59"
 *  
 *  
 *  Este processo segue até o usuário acerta.
 *  No final, o programa mostra a quantidade de tentativas.
 */

public class AdivinhaNumero {

	public static void main(String[] args) {

		int numero = new Random().nextInt(1, 100);
		int contador = 0, informado = 0, min = 1, max = 100;

		while (true) {

			informado = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor de " + min + " a " + max));
			contador++;

			if (numero != informado) {
				if (informado > numero) {
					max = informado + 1;
				} else {
					min = informado - 1;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Acertou miserável \n" + "Quantidade de tentativas: " + contador);
				break;
			}
		}

	}

}
