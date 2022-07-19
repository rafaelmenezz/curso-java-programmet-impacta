package curso.java.veolia.ternario;

public class OperadorTernario01 {

	public static void main(String[] args) {
		/*
		 * Operado ternário: possui tres operandos 
		 * 
		 * op1 ? op2: op3 -> 
		 * 		op1 é expressão booleana
		 * 		op2 é uma instrução caso a expressão op1 for verdadeiro
		 * 		op3 é a instrução caso a expressão op1 for falso
		 */
		
		int idade = 20;
		String status = idade > 18 ? "Maior de idade" : "Menor de idade";
		
		System.out.println("status: " + status);
		
		/*
		 *  Se um curso tiver a partir de 100 horas, sua descrição é java.
		 *  Caso contrário, sua descrição é outra linguagem.
		 *  
		 */
		
		int ch = 100;
		System.out.println(ch >= 100 ? "Java" : "Outra linguagem");
		
		// Determinar o número de dias dos 3 primeiros meses de algum ano
		
		int ano = 2020;
		int dias = 31 + (2020 % 4 == 0 ? 29: 28) + 31;
		
		System.out.println("dias: " + dias);
		
		
	}
}
