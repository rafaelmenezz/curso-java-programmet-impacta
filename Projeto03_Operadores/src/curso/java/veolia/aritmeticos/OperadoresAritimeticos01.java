package curso.java.veolia.aritmeticos;

public class OperadoresAritimeticos01 {

	public static void main(String[] args) {
		
		/*
		 * Vamos sicorrer sobre o operador de adição. Ele representa soma ou concatenação
		 */
		
		int n1 = 10, n2 = 12, n3 = 15;
		
		var soma1 = n1 + n2 + n3;
		var soma2 = n1 + n2 + "" + n3;
		var soma3 = "" + n1 + n2 + n3;
		var soma4 = "Soma: " + (n1 + n2 + n3);  // o resultado da soma entre parenteses é 
												// concatenado com a string "soma : "	
		
		System.out.println(soma1);
		System.out.println(soma2);
		System.out.println(soma3);
		System.out.println(soma4);
	}
}
