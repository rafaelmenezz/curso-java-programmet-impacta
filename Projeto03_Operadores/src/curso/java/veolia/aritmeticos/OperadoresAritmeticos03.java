package curso.java.veolia.aritmeticos;

public class OperadoresAritmeticos03 {

	public static void main(String[] args) {
		/*
		 * Divisão inteira e divisão real
		 */
		
		int n1 = 10, n2 = 3; 
		double n3 = 15;
		
		int div1 = n1 / n2;
		int resto = n1 % n2; // operador môdulo ou resto da divisão inteira
		
		double div2 = n1 / n2;
		double div3 = n1 / (double) n2;
		double div4 = n1 / n3;
		
		System.out.println("div1: " + div1);
		System.out.println("resto: " + resto);
		System.out.println("div2: " + div2);
		System.out.println("div3: " + div3);
		System.out.println("div4: " + div4);
	}

}
