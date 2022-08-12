package aplicacao;

import javax.swing.JOptionPane;

import interfaces.Mensagem;

public class AppMensagem {
	public static void main(String[] args) {
		// String mostrar();
		
		Mensagem msg1 = () -> "Java Programmer";
		Mensagem msg2 = () -> String.valueOf(Math.random());
		Mensagem msg3 = () -> {
			String texto = JOptionPane.showInputDialog("Informe um texto;");
			return texto;
		};
		
		System.out.println("msg1: " + msg1.mostrar());
		System.out.println("msg2: " + msg2.mostrar());
		System.out.println("msg3: " + msg3.mostrar());
	}
}
