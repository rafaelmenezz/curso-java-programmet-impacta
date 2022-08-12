package curso.java.veolia.excecoes;

import java.util.Scanner;

public class AppExcecoes02 {

	public static void main(String[] args) {
		try {
			criarScanner();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void criarScanner() {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.print("Informe um numero: ");
			int numero = Integer.parseInt(entrada.next());
			System.out.println(numero);
		} finally {
			System.out.println("Executando o finally");
			entrada.close();
		}
	}
}
