package curso.java.veolia.aplicacao;

import java.util.ArrayList;

import curso.java.veolia.classes.Aluno;
import curso.java.veolia.classes.Pessoa;
import curso.java.veolia.classes.Utilitarios;

public class AppUtilitarios {

	public static void main(String[] args) {
		
		ArrayList<Pessoa> listaP = new ArrayList<>();
		ArrayList<Aluno> listaA = new ArrayList<>();
		Utilitarios.receberPessoa(listaP);
		
		
	}
}
