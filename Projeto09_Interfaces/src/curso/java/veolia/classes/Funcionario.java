package curso.java.veolia.classes;

import java.text.NumberFormat;

import curso.java.veolia.enumeracoes.Sexo;
import curso.java.veolia.interfaces.Documento;

public class Funcionario extends Pessoa {

	private String cargo;
	private double salario;

	public Funcionario(Documento documento, String nome, String cargo, double salario) {
		super(documento, nome);
		this.setCargo(cargo);
		this.setSalario(salario);
	}
	
	public Funcionario(Documento documento, String nome, int idade, String cargo, double salario) {
		this(documento, nome,cargo,salario);
	}
	
	public Funcionario(Documento documento, String nome, int idade, Sexo sexo, String cargo, double salario) {
		this(documento, nome,idade,cargo,salario);
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String getDados() {
		StringBuilder text = new StringBuilder();
		text.append(super.getDados())
		.append("\n\nCargo: ").append(this.getCargo())
		.append("\nSalário: ").append(NumberFormat.getCurrencyInstance()
				.format(this.getSalario()));
		return text.toString();
		
		
	}
}
