package curso.java.veolia.exercicios;

import java.util.Scanner;

public class Exercicio01_DiasRestantes {

	public static void main(String[] args) {
		/*
		 * O usuário informa: dia, mes e ano
		 * Com base nestas informações, apresentar o numero de dias para terminar o ano
		 * 
		 * Dicas: 	Usar array contendo a quantidade de dias de cada mês
		 * 			
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o dia: ");
		int dia = entrada.nextInt();
		System.out.print("Insira o mes: ");
		int mes = entrada.nextInt()-1;
		System.out.print("Insira o ano: ");
		int ano = entrada.nextInt();
		int fev = 28;
		int total = 0;
		if(ano%4 == 0) {
			fev = 29;
		}
		
		int[] meses = new int[] {31, fev, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		total = meses[mes] - dia;
		for(int i = mes+1; i < meses.length; i++) {
			total += meses[i]; 
		}
		System.out.println("Dias restantes para terminar o ano: " + total);
		
		entrada.close();
	}
}
