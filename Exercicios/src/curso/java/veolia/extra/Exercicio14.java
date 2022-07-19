package curso.java.veolia.extra;

/*
 * 	Escrever um programa que incremente uma variável iniciando em 0 e terminando em 200. A cada passagem
 *	pela variável, se o valor for par, este deverá ser acumulado em uma variável e, se for ímpar, acumulado em
 *	outra.
 */
public class Exercicio14 {

	public static void main(String[] args) {
		
		int impar = 0 , par = 0;
		
		for (int i = 0; i < 200; i++) {
			
			if (i % 2 == 0) {
				par += i;
			} else {
				impar += i;
			}
		}
		
		System.out.println("Impar: " + impar);
		System.out.println("Par: " + par);
	}
}
