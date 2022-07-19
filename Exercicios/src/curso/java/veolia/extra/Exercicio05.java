package curso.java.veolia.extra;

import java.util.Scanner;

/*
 	Uma folha de pagamento simplificada contém os itens: Nome do Funcionário, Salário e Taxa de Desconto de
	INSS. O nome e o salário devem ser fornecidos pelo usuário. Criar um programa que considere uma taxa de
	desconto de 8% e mostre no vídeo:
	a. nome do Funcionário
	b. salário bruto
	c. valor do INSS
	d. salário líquido
 */

public class Exercicio05 {

	public static void main(String[] args) {
		
		String nomeFuncionario;
		Double salario;
		Double descontoINSS = 0.8;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome do funcionário: ");
		nomeFuncionario = leia.nextLine();
		System.out.print("Informe o salário: ");
		salario = leia.nextDouble();
		System.out.println("Sálario líquido é : R$ "+ (salario * 0.8));
		
		leia.close();
	}
}
