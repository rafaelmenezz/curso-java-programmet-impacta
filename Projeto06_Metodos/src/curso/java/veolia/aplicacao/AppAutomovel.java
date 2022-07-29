package curso.java.veolia.aplicacao;

import javax.swing.JOptionPane;

import curso.java.veolia.classes.Automovel;
import curso.java.veolia.classes.util.Utilitarios;

public class AppAutomovel {

	public static void main(String[] args) {
		Automovel auto = new Automovel();
		
		auto.setDados("fiat","147" , 1971);
//		auto.setMarca(null);
//		auto.setModelo("147");
//		auto.setAno(1990);
		
		
		System.out.println(auto.getDados());
		
		Utilitarios.alterarMarca(auto);

		JOptionPane.showMessageDialog(null, auto.getDados("Informações: "));
		JOptionPane.showMessageDialog(null, auto.getDados(), "Nossa mensagem", JOptionPane.ERROR_MESSAGE);
		
		
		
		
	}
}
