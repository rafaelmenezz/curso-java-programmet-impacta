package aplicacao;

import javax.swing.JOptionPane;

import interfaces.Mensagem;

public class AppMensagem {

	public static void main(String[] args) {
		Mensagem msg1 = () -> "Java Programmer";
		Mensagem msg2 = () -> "Valor gerado: " + Math.random();
		Mensagem msg3 = () -> {
			String texto = JOptionPane.showInputDialog("Informe um texto:");
			return texto;
		};
		
		System.out.println(msg1.mostrar());
		System.out.println(msg2.mostrar());
		System.out.println(msg3.mostrar());

	}
}
