package curso.java.veolia.exercicio;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Double n1, x;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um número: ");
		n1 = leia.nextDouble();
		x = n1;
		
		
		while (n1 > 1) {
			x = x *(n1-1);
			n1--;
			System.out.println(x);
		}
	}
	
}
