package curso.java.veolia.aplicacao;

import javax.swing.JOptionPane;

import curso.java.veolia.classes.Endereco;
import curso.java.veolia.classes.Pessoa;
import curso.java.veolia.enumeracoes.Sexo;

public class AppPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Janete Santos",30, Sexo.FEMININO);
	
		pessoa.setEndereco(new Endereco("Rua ceará", 100, "Campinas", "30111150"));
		
		JOptionPane.showMessageDialog(null, pessoa.getDados());
		
		
	}
}
