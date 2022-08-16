package curso.java.veolia.classes;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

import curso.java.veolia.enumerados.Sexo;
import curso.java.veolia.interfaces.Documento;

public class Aluno extends Pessoa{

	private String matricula;
	private List<Curso> cursos;
	
	
	public Aluno(Documento documento, String nome, String matricula) {
		super(documento, nome);
		this.setMatricula(matricula);
		this.setCursos(new ArrayList<Curso>());
	}
	
	public Aluno(Documento documento, String nome, int idade, String matricula) {
		this(documento, nome, matricula);
		this.setIdade(idade);
	}
	
	public Aluno(Documento documento, String nome, int idade, Sexo sexo, String matricula) {
		this(documento, nome, idade, matricula);
		this.setSexo(sexo);
	}
	
	public Aluno(Documento documento, String nome, int idade, Sexo sexo, String matricula, List<Curso> cursos) {
		this(documento, nome, idade, sexo, matricula);
		this.setCursos(cursos);
	}

	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		if(this.cursos == null) {
			this.cursos = cursos;
		} else {
			this.cursos.addAll(cursos);
		}
	}
	
	public String listarCursos() {
		Formatter formatter = new Formatter();
		String linha = "-".repeat(42);
		String cabecalho = formatter.format("%s%n%6s %-20s %-3s %10s%n%s",
				linha, "CÓDIGO", "DESCRIÇÃO", "CH", "PREÇO", linha).toString();
		StringBuilder builder = new StringBuilder(cabecalho);
		
		
		if(this.getCursos().size() > 0) {
			for (Curso curso : this.getCursos()) {
				builder.append(curso.getLinha());
			}
		} else {
			builder.append("Nenhum curso atribuído para este aluno");
		}
		formatter.close();
		return builder.toString();
	}
	
	public String getDados() {
		String resposta = "Aluno: " + "\nNome: " + super.getNome()
		+ "\nIdade: " + super.getIdade() + "\nSexo: " + super.getSexo()
		+ "\nMatrícula: " + this.matricula;
		if(this.getEndereco() != null) {
			resposta += "\nEndereco: " + super.getEndereco().getLogradouro() + ", "
			+ super.getEndereco().getCidade() + ", "
			+ super.getEndereco().getNumero()
			+ " - CEP: " + super.getEndereco().getCep();	
		}
		return resposta;
	}

	@Override
	public String toString() {
		String resposta = "Aluno: " + "\nNome: " + super.getNome()
		+ "\nIdade: " + super.getIdade() + "\nSexo: " + super.getSexo()
		+ "\nMatrícula: " + this.matricula;
		if(this.getEndereco() != null) {
			resposta += "\nEndereco: " + super.getEndereco().getLogradouro() + ", "
			+ super.getEndereco().getCidade() + ", "
			+ super.getEndereco().getNumero()
			+ " - CEP: " + super.getEndereco().getCep();	
		}
		return resposta;
	}
}
