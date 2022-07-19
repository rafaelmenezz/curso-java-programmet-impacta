package curso.java.veolia.logicos;

public class OperadoresLogicos01 {

	public static void main(String[] args) {
		int n1 = 10, n2 = 10;
		
		//operadores relacionais 
		boolean b1 = n1 > n2;		// false
		boolean b2 = n2++ > 10;		// false
		boolean b3 = ++n1 == 11;	// true
		
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		System.out.println("b3 : " + b3);
		System.out.println("#".repeat(50));
		
		//operadores logicos: AND(&&), OR(||), NOT(!)
		
		/*
		 *	Os operadores lógicos && e || avaliam as expressões o suficiente para obtermos uma resposta, não avaliando as 
		 * 	demais operações se não for necessário. Por isso são chamados de operadores 'short-circuit'
		 */
		
		boolean b4 = (n1 > 0) || (++n2 > 0);
		System.out.println();
		System.out.println("b4 : " + b4);
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
	}
		
}
