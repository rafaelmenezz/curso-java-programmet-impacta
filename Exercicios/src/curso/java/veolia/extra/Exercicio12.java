package curso.java.veolia.extra;

import java.util.Scanner;

public class Exercicio12 {
	
/*	
 	12. Elaborar um programa que mostre os N primeiros termos da série de Fibonacci (N deve ser lido do teclado).
	Esta série é definida pela seguinte regra: A partir do terceiro elemento. cada termo é a soma dos dois
	anteriores
	1 1 2 3 5 8 13 ...
	
*/	
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 0;
		int i = 0;
	
		while ( i < 100) {
			System.out.println(i);
			i = n1 + n2;
			n2 = n1;
			n1 = i;
		}
	}
}
