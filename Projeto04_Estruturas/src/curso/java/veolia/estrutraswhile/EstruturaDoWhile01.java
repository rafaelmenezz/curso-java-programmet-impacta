package curso.java.veolia.estrutraswhile;

public class EstruturaDoWhile01 {

	public static void main(String[] args) {
		
		int contador = 10;
		
		do {
			System.out.println("Contador: " + contador++);
		} while (contador < 10);
		System.out.println("___________FIM DO PROGRAMA_________");
	}
}
