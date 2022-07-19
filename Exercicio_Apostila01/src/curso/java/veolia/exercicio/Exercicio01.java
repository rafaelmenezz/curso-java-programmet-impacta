package curso.java.veolia.exercicio;

import java.util.Scanner;

/*
 * Escrever um programa que apresente no vídeo seu nome completo em uma linha e o RG na outra.
 * */

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		String nomeCompleto;
		String rg;
		
		System.out.print("Informe seu nome completo: ");
		nomeCompleto = leia.nextLine();
		System.out.print("Informe o rg: ");
		rg = leia.nextLine();
		
		System.out.println("#############################");
		System.out.println("Nome completo: " + nomeCompleto);
		System.out.println("Seu rg: " + rg);
		
		
	}

}
