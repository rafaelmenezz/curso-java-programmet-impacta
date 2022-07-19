package curso.java.veolia.exercicio;

import java.util.Scanner;

/*
 * 	Um programa contém duas variáveis inteiras e cada uma destas variáveis deve ter um valor fornecido pelo
	usuário. Escrever um programa que mostre os seguintes resultados:
	
	a. A soma das duas variáveis
	b. A diferença entre as duas variáveis
	c. O dobro da primeira mais o triplo da segunda variável
	d. A multiplicação das duas variáveis
 */

public class Exercicio02 {

	public static void main(String[] args) {
		
		int n1, n2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("Informe o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("a) Doma: " + (n1 + n2));
		System.out.println("b) Diferença: " + (n1 - n2));
		System.out.println("c) Dobro: numero 1: " + (n1 * 2 ) + " Dobro número 2: " + (n2 * 2));
		System.out.println("d) Mutiplicação entre duas variáveis: " + (n1 * n2));
		
		leia.close();
	}
}
