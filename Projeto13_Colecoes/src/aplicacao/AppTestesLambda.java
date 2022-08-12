package aplicacao;

import classes.Utilitarios;

public class AppTestesLambda {
	public static void main(String[] args) {
		boolean resposta = Utilitarios.verificarTexto("Tava com fome na sexta", s -> s.length());
		System.out.println(resposta);
		
		resposta = Utilitarios.verificarTexto("321", s -> Integer.parseInt(s));
		System.out.println(resposta);
		
	}
}
