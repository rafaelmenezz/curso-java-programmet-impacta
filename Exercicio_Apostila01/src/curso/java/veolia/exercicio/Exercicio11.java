package curso.java.veolia.exercicio;

import java.util.Scanner;


	//Escrever um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.

public class Exercicio11 {

	public static void main(String[] args) {
		
		int n1, x, y;
		StringBuilder str = new StringBuilder();
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um número: ");
		n1 = leia.nextInt();
		x = n1;
		y = n1;
		
		
		while (n1 > 1) {
			x = x *(n1-1);
			n1--;
			
			if (y==n1) {
				str.append(y);
				str.append('!');
				str.append('\n');
			} else {
				str.append(y);
				str.append('!');
		
			
				for (int i = y-1; i >= n1 ; i--) {
					str.append(" * ");
					str.append(" ");
					str.append(i);			
				}
				str.append(" = ");
				str.append(x);
				str.append('\n');
			}
			
		}
		System.out.println(str.toString());
	}
	
}
