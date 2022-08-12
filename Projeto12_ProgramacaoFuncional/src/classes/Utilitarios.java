package classes;

import enumerados.Sexo;
import interfaces.Busca;

public abstract class Utilitarios {

	public static double calculaMedia(double... numeros) {
		if(numeros == null) {
			throw new NullPointerException("O parâmetro não pode ser nulo");
		}
		double soma= 0;
		for(double item : numeros) {
			soma+= item;
		}
		return numeros.length > 0 ? soma/numeros.length : soma;
	}
	
	public static double calcularValorLiquido(double preco, double... taxas) {
		
		if(taxas.length > 2) {
			throw new ArrayIndexOutOfBoundsException
			("A quantidade de taxas excede o número máximo");
		}
		double taxa = 0;
		double imposto = 0;
		
		if(taxas.length == 1) {
			taxa = taxas[0];
		} else if(taxas.length == 2) {
			taxa = taxas[0];
			imposto = taxas[1];
		}
		return preco * (1 - taxa/100 - imposto/100);
	}
	
	public static String calcularPedido(String pedido, double... itens) {
		double total = 0;
		for (double item : itens) {
			total += item;
		}
		return "Pedido: " + pedido + ", Total: " + total;
	}
		
	// método que recebe um array de objetos Pessoa e retorna este array atualizado
	public static Pessoa[] atualizarPessoas(Pessoa[] pessoas) {
		if(pessoas.length > 0) {
			if(pessoas instanceof Aluno[]) {
			pessoas[0] = new Aluno
					(new DocumentoCpf("11111111111"), "José",30, Sexo.MASCULINO, "1234");
		}
		}
		return pessoas;
	}
	
	public static boolean verificarTexto (String s, Busca busca) {
		return busca.executar(s) > 10;
	}
	
	
}
