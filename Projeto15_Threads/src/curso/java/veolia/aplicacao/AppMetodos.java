package curso.java.veolia.aplicacao;

import classes.Aluno;
import classes.DocumentoCpf;
import classes.Funcionario;
import classes.Utilitarios;
import curso.java.veolia.enumerados.Sexo;

public class AppMetodos {

	public static void main(String[] args) {
		double m1 = Utilitarios.calculaMedia(2);
		double m2 = Utilitarios.calculaMedia(3, 6, 8, 4, 9, 10);
		double m3 = Utilitarios.calculaMedia(new double[] {9,3,2,4});
		double m4 = Utilitarios.calculaMedia();

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		double vl1 = Utilitarios.calcularValorLiquido(1000);
		double vl2 = Utilitarios.calcularValorLiquido(1000, 10);
		double vl3 = Utilitarios.calcularValorLiquido(1000, 10, 5);

		System.out.println();
		System.out.printf("Valor Liquido 1: %.2f \n", vl1);
		System.out.printf("Valor Liquido 1: %.2f \n", vl2);
		System.out.printf("Valor Liquido 1: %.2f \n", vl3);
		
		String pedido1 = Utilitarios.calcularPedido("123-4");
		String pedido2 = Utilitarios.calcularPedido("123-5", 120, 32, 45, 98);
		
		System.out.println();
		System.out.println(pedido1);
		System.out.println(pedido2);
		
		Aluno[] alunos = 
			{new Aluno(new DocumentoCpf("22222222222"), "Jorge", 20, Sexo.MASCULINO, "120"),
			 new Aluno(new DocumentoCpf("33333333333"), "Marisa", 19, Sexo.FEMININO, "122"),
			 new Aluno(new DocumentoCpf("44444444444"), "Clara", 21, Sexo.FEMININO, "124")};		
			
	
	Funcionario[] funcionarios = 
		{new Funcionario(new DocumentoCpf("55555555555"), "Manoel", "Assistente", 3000),
		 new Funcionario(new DocumentoCpf("66666666666"), "Jeniffer", "Dentista", 5000),
		 new Funcionario(new DocumentoCpf("77777777777"), "Sergio", "Recepcionista", 2500)};		
		
		var p1 = Utilitarios.atualizarPessoas(alunos);
		var p2 = Utilitarios.atualizarPessoas(funcionarios);

		System.out.println("-- Lista de Alunos--");
		for (Aluno aluno : (Aluno[])p1) {
			System.out.println(aluno + "\n");
		}
		
		System.out.println("-- Lista de Funcionarios--");
		for (Funcionario funcionario : (Funcionario[])p2) {
			System.out.println(funcionario + "\n");
		}
	}
}
