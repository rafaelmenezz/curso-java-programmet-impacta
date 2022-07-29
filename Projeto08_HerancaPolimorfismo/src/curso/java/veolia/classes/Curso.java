package curso.java.veolia.classes;

import java.util.Random;

public class Curso {

	private final int codigo;
	private String descricao;
	private int ch;
	private double preco;

	public Curso(String descricao, int ch) {
		this.codigo = new Random().nextInt(100,1000);
		this.setDescricao(descricao);
		this.setCh(ch);
	}

	public Curso(String descricao, int ch, double preco) {
		this(descricao,ch);
		this.setPreco(preco);
	}

	public int getCodigo() {
		return codigo;
	}

//	public void setCodigo(int codigo) {
//		this.codigo = codigo;
//	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Curso: " + this.getCodigo() + " - " + this.getDescricao();
	}
	
}
