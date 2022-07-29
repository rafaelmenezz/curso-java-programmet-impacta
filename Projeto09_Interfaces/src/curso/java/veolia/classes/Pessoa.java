package curso.java.veolia.classes;

import curso.java.veolia.enumeracoes.Sexo;
import curso.java.veolia.interfaces.Documento;

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

	public Pessoa(Documento documento,String nome, int idade) {
		this(documento, nome);
		this.setIdade(idade);
	}

	public Pessoa(Documento documento, String nome, int idade, Sexo sexo) {
		this(documento, nome, idade);
		this.setSexo(sexo);
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
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
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	
	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getDados() {
		StringBuilder text = new StringBuilder("DADOS PESSOAIS")
				.append("\nDocumento: ").append(this.getDocumento().getNumero())
				.append("\nNome: ").append(this.getNome())
				.append("\nIdade: ").append(this.getIdade())
				.append("\nSexo: ").append(this.getSexo());
		if (this.getEndereco() != null) {
			text.append("\n\n").append(this.getEndereco().getDados());
		}
		return text.toString();
	}
}
