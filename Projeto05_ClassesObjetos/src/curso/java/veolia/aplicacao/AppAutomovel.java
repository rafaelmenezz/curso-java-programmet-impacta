package curso.java.veolia.aplicacao;

import javax.swing.JOptionPane;

import curso.java.veolia.classes.Automovel;

public class AppAutomovel {

	public static void main(String[] args) {
		
		/*
		 * Atributos publicos nao sao recomendados pois nao configuram
		 * orientacao a objetos.
		 * 
		 * Suponha que o ano do automovel nao possa ser menor que 1970
		 */
		
		Automovel auto1 = new Automovel();
		auto1.marca = "Fiat";
		auto1.modelo = "147";
		auto1.ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));
		if(auto1.ano < 1970) {
			auto1.ano = 1970;
		}
		
		Automovel auto2 = new Automovel();
		auto1.marca = "Fiat";
		auto1.modelo = "Uno";
		auto1.ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano: "));
		if(auto1.ano < 1970) {
			auto1.ano = 1970;
		}
		
		/*
		 * No exemplo anterior, cometemos tres erros gravissimos:
		 * 
		 * 1. existe a necessidade de validarmos individualmente cade um dos atributos
		 * 	(o que contraria a orientação a objetos)
		 * 
		 * 2. Existe a possibilidade de atribuirmos um valor inválido para o atributo,
		 * 	para depois consertarmos.
		 * 
		 * 3. Quando o atributo possui valor inválido, estamos corrigindo o valor de acordo
		 * com a nossa coveniencia.
		 * 
		 */
		// Para contornar estes erros, devemos implementar o Encapsulamento.
	}
}
