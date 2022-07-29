package curso.java.veolia.classes;

import curso.java.veolia.enumeracoes.Sexo;

public abstract class Pessoa {

	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereco;

	public Pessoa(String nome) {
		this.setNome(nome);
	}
	
	public Pessoa(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
		
	}
	
	public Pessoa(String nome,int idade, Sexo sexo) {
		this.setNome(nome);
		this.setIdade(idade);
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
	
	public String getDados() {
		StringBuilder text = new StringBuilder("DADOS PESSOAIS")
				.append("\nNome: ").append(this.getNome())
				.append("\nIdade: ").append(this.getIdade())
				.append("\nSexo: ").append(this.getSexo());
		if(this.getEndereco() != null) {
			text.append("\n\n").append(this.getEndereco().getDados());
		}
		return text.toString();
		
		
	}
}
