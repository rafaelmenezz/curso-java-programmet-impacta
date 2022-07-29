package curso.java.veolia.aplicacao;

import java.util.Scanner;

import curso.java.veolia.classes.util.Utilitarios;

public class AppUtilitarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número para obter seu fatorial: ");
		int n = sc.nextInt();
		
		System.out.printf("O fatorial de %d é %d.", n , Utilitarios.calcularFatorial(n));
		
//		chamada ao método recursivo
		System.out.print("\nInforme um número para obter seu fatorial (recursivo): ");
		int n1 = sc.nextInt();
		
		System.out.printf("O fatorial de %d é %d.", n1 , Utilitarios.calcularFatorialRec(n));
		
		sc.close();
	}
}
