package curso.java.veolia.classes;

import curso.java.veolia.enumeracoes.Sexo;

public class Pessoa {

	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereco;

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
