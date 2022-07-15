package curso.java.veolia.exercicio;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		double base;
		double expoente;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe a base: ");
		base = leia.nextDouble();
		System.out.println("Informe o expoente: ");
		expoente = leia.nextDouble();
		
		System.out.println("#############################");
		System.out.println("Potência: " + (Math.pow(base, expoente)));
	}
}
