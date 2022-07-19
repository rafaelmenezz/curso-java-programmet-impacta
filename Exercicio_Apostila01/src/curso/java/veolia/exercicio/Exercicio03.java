package curso.java.veolia.exercicio;

import java.util.Scanner;

/*
  	Escrever um programa que contenha duas variáveis reais, onde a primeira represente um valor e a segunda,
	uma porcentagem, ambos fornecidos. O programa deve mostrar:
  	1. O valor da primeira variável
	2. O valor da porcentagem com seu símbolo
	3. O resultado da aplicação da porcentagem sobre o valor da primeira variável
 
 */

public class Exercicio03 {

	public static void main(String[] args) {
		
		Double valor;
		Double porcentagem;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		valor = leia.nextDouble();
		System.out.print("Informe a porcetagem: ");
		porcentagem = leia.nextDouble();
		
		System.out.println("#####################################");
		System.out.println("a) Valor do valor: " + valor);
		System.out.println("b) Valor da porcentagem: " + porcentagem);
		System.out.println("c) Valor da aplicado: " + (valor + ( valor * (porcentagem/100))));
		
	}
}
