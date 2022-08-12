package curso.java.veolia.arrays;

import java.util.Scanner;

public class AppArrays02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantidade de notas: ");
		int quantidade = entrada.nextInt();
		
		double notas[] = new double[quantidade];
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i+1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		System.out.println("Apresentando as notas: ");
		for (double d : notas) {
			System.out.println(d);
		}
		entrada.close();
	}
}
