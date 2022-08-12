package curso.java.veolia.excecoes;

import java.util.Scanner;

public class AppExcecoes01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.print("Informe um numero: ");
			int numero = Integer.parseInt(entrada.next());
			System.out.println(numero);
		} catch (NumberFormatException e) {
			throw e;
		} finally {
			System.out.println("Executando o finally");
			entrada.close();
		}
	}
	
}
