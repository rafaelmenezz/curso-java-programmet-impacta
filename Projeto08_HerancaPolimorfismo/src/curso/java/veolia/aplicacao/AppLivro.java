package curso.java.veolia.aplicacao;

import curso.java.veolia.classes.Funcionario;
import curso.java.veolia.classes.Livro;
import curso.java.veolia.enumeracoes.Sexo;

public class AppLivro {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Joaquim");
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.getDados();
	}
}

