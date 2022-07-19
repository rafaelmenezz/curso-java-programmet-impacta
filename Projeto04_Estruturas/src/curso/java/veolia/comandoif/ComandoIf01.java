package curso.java.veolia.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf01 {

	public static void main(String[] args) {
		/*
		 * Neste programa, o usuário informa o nome de umas pessoa.
		 * Se o nome informado tiver mais do que 10 caracteres, o programa
		 * informa: "Nome muito longo
		 */
		
		String nome = JOptionPane.showInputDialog("Informe um nome");
		System.out.println("Nome informado: " + nome);
		
		
		/*
		 * Quando existir apenas uma instrução condicionada ao comando if(), não é necessário 
		 * abrir um bloco de código, mas é recomendado fazé-lo por questões de boas práticas
		 */
		
		if(nome.length() > 10)
			System.out.println("Nome muito longo.");
	}
	
}
