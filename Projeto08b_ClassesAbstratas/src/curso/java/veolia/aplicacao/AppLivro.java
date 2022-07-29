package curso.java.veolia.aplicacao;

import javax.swing.JOptionPane;

import curso.java.veolia.classes.Funcionario;
import curso.java.veolia.classes.Livro;
import curso.java.veolia.enumeracoes.Sexo;

public class AppLivro {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		
		livro.setTitulo("As croncas do Java");
		
		livro.setAutor(new Funcionario("Joaquim", 45, Sexo.MASCULINO, "Escritor",6000));
		
		JOptionPane.showMessageDialog(null, livro.getDados());
	}
}

