package curso.java.veolia.aritmeticos;

public class OperadoresAritmeticos04 {
	/*
	 * Operadores de incremento e decremento pré e pós fixados
	 * (ou pré-incremento / pós-incremento / pré-decremento / pós-decremento)
	 */
	public static void main(String[] args) {
		
		System.out.println("_".repeat(40));
		int n1 = 10, n2 = 10;
		
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		// usandos os operadores de incremento
		
		n1++;
		++n2;
		
		System.out.println("n1++: " + n1);
		System.out.println("++n2: " + n2);
		System.out.println("_".repeat(40));
		
		
		int n3 = n1++;
		int n4 = ++n2;
		
		System.out.println("n1: " + n1);
		System.out.println("n3: " + n3);
		System.out.println("n2: " + n2);
		System.out.println("n4: " + n4);
		
	}
}
