package curso.java.veolia.aplicacao;

import java.util.ArrayList;

import classes.Aluno;
import classes.Pessoa;
import classes.Utilitarios;

public class AppUtilitarios {

	public static void main(String[] args) {
		
		ArrayList<Pessoa> listaP = new ArrayList<>();
		ArrayList<Aluno> listaA = new ArrayList<>();
		Utilitarios.receberPessoa(listaP);
		
		
	}
}
