package curso.java.veolia.excecoes;

import java.io.IOException;
import java.util.Scanner;

import classes.DocumentoCpf;

public class AppExcecoes03 {

	public static void main(String[] args) {

		try(Scanner entrada = new Scanner(System.in)){
			System.out.print("Informe um texto: ");
			String texto = entrada.next();
			System.out.println(texto);
		}
		
		try(DocumentoCpf c1 = new DocumentoCpf("11111111111")){
			System.out.println(c1.getNumero());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
