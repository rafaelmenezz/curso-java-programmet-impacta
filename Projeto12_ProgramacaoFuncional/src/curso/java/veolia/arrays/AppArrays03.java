package curso.java.veolia.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AppArrays03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantidade de nomes: ");
		int quantidade = entrada.nextInt();
		
		String[] nomes = new String[quantidade];
		
		entrada.nextLine();
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Informe o nome " + (i+1) + ":");
			nomes[i] = entrada.nextLine();
		}
		
		Arrays.sort(nomes);
		System.out.println("Apresentando os nomes: ");
		for (String n : nomes) {
			System.out.println(n);
	}
		
		entrada.close();
	}
}
