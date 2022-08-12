package classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.List;

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
	
	public static void receberPessoa(List<Pessoa> pessoas) {
		pessoas.add(new Funcionario(new DocumentoCpf("11111111111"), "Joseph", "Professor", 5000));
		pessoas.add(new Aluno(new DocumentoCpf("11111111111"), "PHP", "2021"));
	}
	
	public static void receberPessoaGenerica(List<? extends Pessoa> pessoas) {
		
	}
	
	public static void gerarLog(String texto){
		String arquivo = "/home/jonathan.albuquerque/Documentos/emilio/excecoes.log";
		Formatter fmt;
		File file = new File(arquivo);
		
		try {
		
		String cabecalho = "";
		if(!file.exists()) {
			fmt = new Formatter();
			cabecalho = fmt.format("%-12s%-7s%-30s%n%49s%n",
					"DATA", "HORA", "MENSAGEM", "-".repeat(49)).toString();
			fmt.close();	
		}
		Date data = new Date();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy  HH:mm  ");
		String sData = df.format(data);
		
		fmt = new Formatter();
		String mensagem = fmt.format("%-19s%-30s%n", sData, texto).toString();
		
		FileWriter writer = new FileWriter(arquivo, true);
		writer.write(cabecalho + mensagem);
		writer.close();
		fmt.close();

		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
