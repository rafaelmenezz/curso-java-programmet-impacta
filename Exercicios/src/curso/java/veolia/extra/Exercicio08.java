package curso.java.veolia.extra;

	/*
	 * Considerando o problema anterior, criar um novo programa que incremente uma variável com a mesma faixa
	 *	de valores, e mostre no vídeo somente os números pares ou múltiplos de 6.
	 */

public class Exercicio08 {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println((i%2==0) || (i%6==0)? i : "-" );
		}
	}
}
