package curso.java.veolia.classes.util;

import curso.java.veolia.classes.Automovel;

public class Utilitarios {

	public static double calcularSoma(double x, double y) {
		return x + y;
	}
	
	public static void alterarMarca(Automovel automovel) {
		automovel.setMarca("Nova marca");
	}
	
//	método que calcula o fatorial de um numero passado como parâmetro
	
	public static int calcularFatorial(int n) {
		int fatorial = 1;
		for (int i = n; i >= 1 ; i--) {
			fatorial *=i;
		}
		return fatorial;
	}
	
//	calculo do fatorial de forma recursiva
	
	public static int calcularFatorialRec(int n ) {
		return n <=1 ? 1: n * calcularFatorialRec(n - 1);
	}
}
