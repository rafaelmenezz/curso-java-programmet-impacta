package curso.java.veolia.leitura;

import java.util.Scanner;

public class LeituraScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.println("Nome informado: " + nome);
		System.out.println("Idade informado: " + idade);
		
		scanner.close();
	}
}
