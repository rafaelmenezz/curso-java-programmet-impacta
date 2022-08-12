package classes;

import enumerados.Sexo;
import interfaces.Documento;

public abstract class Pessoa {

	private Documento documento;
	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereco;
	
	public Pessoa(Documento documento, String nome) {
		this.setDocumento(documento);
		this.setNome(nome);
	}

	public Pessoa(Documento documento, String nome, int idade) {
		this(documento, nome);
		this.setIdade(idade);
	}
	
	public Pessoa(Documento documento, String nome, int idade, Sexo sexo) {
		this(documento, nome, idade);
		this.setSexo(sexo);
	}
	
	public Pessoa() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(idade < 0) {
			throw new NumberFormatException("A idade não pode ser negativa");
		}
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		if(sexo == null) {
			throw new NullPointerException("Sexo Inválido");
		}
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		if(endereco == null) {
			throw new NullPointerException("Endereço Inválido");
		}
		this.endereco = endereco;
	}
	
	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	
	public String toString() {
		String resposta = "Documento: " + this.getDocumento().getNumero() + "\nPessoa: " + "\nNome: " + this.nome
				+ "\nIdade: " + this.idade + "\nSexo: " + this.sexo;
		
		if(this.getEndereco() != null) {
				resposta+= "\nEndereco: " + this.endereco.getLogradouro() + ", "
				+ this.endereco.getCidade() + ", "
				+ this.endereco.getNumero()
				+ " - CEP: " + this.endereco.getCep();
		}
		return resposta;
	}
}
