package classes;

import java.util.Random;

import curso.java.veolia.excecoes.CargaHorariaException;
import curso.java.veolia.excecoes.ValorException;

public class Curso implements Comparable<Curso>{

	private final int codigo;
	private String descricao;
	private int ch;
	private double preco;
	
	public Curso(String descricao, int ch) throws IllegalAccessException, CargaHorariaException {
		this.codigo = new Random().nextInt(100,1000);
		this.setDescricao(descricao);
		this.setCh(ch);
	}
	
	public Curso(String descricao, int ch, double preco) throws IllegalAccessException, CargaHorariaException, ValorException{
		this(descricao,ch);
		this.setPreco(preco);
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) throws IllegalAccessException, CargaHorariaException {
		if(descricao == null || descricao.trim().equals("")) {
			throw new IllegalAccessException("");
		}
		this.descricao = descricao;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) throws IllegalAccessException, CargaHorariaException {
		if(ch<4) {
			throw new CargaHorariaException("A carga horária deve ser no mínimo 4 horas");
		}
		this.ch = ch;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) throws ValorException {
		if(preco < 0) {
			throw new ValorException("O preço do curso não pode ser negativo");
		}
		this.preco = preco;
	}

	public String toString() {
		return "Curso: " + this.getCodigo() + " - " + this.descricao;
	}
	
	@Override
	public int compareTo(Curso o) {
		return this.getDescricao().compareTo(o.getDescricao());
	}
	
}
