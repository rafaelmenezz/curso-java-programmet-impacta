package curso.java.veolia.exercicio;

public class Exercicio08 {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println((i%2==0) || (i%6==0)? i : "-" );
		}
	}
}
