package classes;

import enumerados.Sexo;
import interfaces.Documento;

public class Aluno extends Pessoa{

	private String matricula;
	private Curso curso;
	
	
	public Aluno(Documento documento, String nome, String matricula) {
		super(documento, nome);
		this.setMatricula(matricula);
	}
	
	public Aluno(Documento documento, String nome, int idade, String matricula) {
		this(documento, nome, matricula);
		this.setIdade(idade);
	}
	
	public Aluno(Documento documento, String nome, int idade, Sexo sexo, String matricula) {
		this(documento, nome, idade, matricula);
		this.setSexo(sexo);
	}
	
	public Aluno(Documento documento, String nome, int idade, Sexo sexo, String matricula, Curso curso) {
		this(documento, nome, idade, sexo, matricula);
		this.setCurso(curso);
	}

	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		String resposta = "Aluno: " + "\nNome: " + super.getNome()
		+ "\nIdade: " + super.getIdade() + "\nSexo: " + super.getSexo()
		+ "\nMatrícula: " + this.matricula;
		if(this.getCurso() != null) {
			resposta += "\nCurso: " + this.curso.getDescricao();	
		}
		if(this.getEndereco() != null) {
			resposta += "\nEndereco: " + super.getEndereco().getLogradouro() + ", "
			+ super.getEndereco().getCidade() + ", "
			+ super.getEndereco().getNumero()
			+ " - CEP: " + super.getEndereco().getCep();	
		}
		return resposta;
	}
}
