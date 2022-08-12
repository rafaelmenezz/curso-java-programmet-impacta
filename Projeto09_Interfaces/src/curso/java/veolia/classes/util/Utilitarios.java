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
	// métoo que recebe como parametro, dia, mês ano e retorna o número de dias que restam para terminar o ano
	
	public int calcularDias(int dia, int mes, int ano) {
		if(mes < 1 || mes > 12)
			throw new NumberFormatException("Mês inválido: o valor deve ser entre 1 e 12.");
		
		int[] meses = {31, ano%4 ==0 ? 29 : 28, 31, 30 ,31, 30 , 31, 31 ,30 ,31 , 30, 31};
		 
		return 0;
	}
	
	/*
	 * Qaundo um método declar m 'varargs'
	 * - deve ser unico
	 * - havendo mais de um parametro no método, o 'varargs' deve ser o último
	 * 
	 * Exempleo: método que recebe o valor de um produto e, opcionamente, recebe a
	 * taxa de financiamento e/ou  imposto (nesta ordem), e retorna o valor liquido
	 */

	public static double calcularValorLiquido(double preco, double... taxas) {
		
		if (taxas.length> 2) 
			throw  new ArrayIndexOutOfBoundsException("A quantidade de taxas excede o número máximo");
		
		double taxa = 0;
		double imposto = 0;
		
		if (taxas.length==1) {
			taxa = taxas[0];
		} else {
			taxa = taxas[0];
			imposto = taxas[1];
		}
		return preco * (1 - taxa/100 - imposto/100);
	}
	// método que recebe o número de um pedido (String) e uma lista de itens (valores)
	public static String calcularPedido(String pedido, double... itens ) {
		double total = 0;
		
		for (double item : itens) {
			total += item;
		}
		return "Pedido: " + pedido + ", Total: " + total;
	}  
}
