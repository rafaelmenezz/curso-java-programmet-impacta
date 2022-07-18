package curso.java.veolia.exercicio;

import java.util.Scanner;

public class Exercicio12 {

	
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
