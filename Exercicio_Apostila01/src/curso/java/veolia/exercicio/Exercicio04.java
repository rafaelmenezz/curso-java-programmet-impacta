package curso.java.veolia.exercicio;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int n1,n2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("#####################################");
		System.out.print("Informe o primeiro número: ");
		n1 = leia.nextInt();
		System.out.print("Informe o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("Primeiro número: " + n1 + " Segundo número: " + n2);
		
		System.out.println("O númeor maior é: " + (n1 > n2 ? n1 : n2));
	}

}
