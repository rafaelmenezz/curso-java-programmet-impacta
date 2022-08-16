package curso.java.veolia.aplicacao;

import curso.java.veolia.classes.Utilitarios;
import curso.java.veolia.interfaces.Operacao;

public class AppTesteLambda {

	public static void main(String[] args) {
		boolean resposta = Utilitarios.verificarTexto("Tava com fome na sexta",s -> s.length());
		System.out.println(resposta);
		
		resposta = Utilitarios.verificarTexto("321", s -> Integer.parseInt(s));
		System.out.println(resposta);
		
		Operacao operacao = Utilitarios::calcularValorLiquido;
		double soma = operacao.calcular(2, 4);
		System.out.println(soma);
	}
}
