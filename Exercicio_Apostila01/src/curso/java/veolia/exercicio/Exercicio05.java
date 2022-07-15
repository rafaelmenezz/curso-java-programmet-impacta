package curso.java.veolia.exercicio;

import java.util.Scanner;

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
	}
}
