package curso.java.veolia.classes;

import curso.java.veolia.enumerados.Sexo;
import curso.java.veolia.interfaces.Documento;

public class Funcionario extends Pessoa{

	private String cargo;
	private double salario;
	
	public Funcionario(Documento documento, String nome, String cargo, double salario) {
		super(documento, nome);
		this.setCargo(cargo);
		this.setSalario(salario);
	}
	
	public Funcionario(Documento documento, String nome, int idade, Sexo sexo, String cargo, double salario) {
		super(documento, nome, idade, sexo);
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public Funcionario() {}

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
		
		try {
			if(salario <= 2000) {
				throw new NumberFormatException("Salario inválido");
			}
			this.salario = salario;
		} catch (NumberFormatException e) {
			IllegalArgumentException ex = new IllegalArgumentException
					("O valor " + salario + "é inferior a R$2.000");
			ex.initCause(new ArithmeticException("Em SC, o salário mínimo é 2000"));
			e.initCause(ex);
			throw e;
		}
	}
	
	@Override
	public String toString() {
		String resposta = "Funcionário: " + "\nNome: " + super.getNome()
				+ "\nIdade: " + super.getIdade() + "\nSexo: " + super.getSexo()
				+ "\nCargo: " + this.cargo + "\nSalário: " + this.salario;
		if(this.getEndereco() != null) {
				resposta += "\nEndereco: " + super.getEndereco().getLogradouro() + ", "
				+ super.getEndereco().getCidade() + ", "
				+ super.getEndereco().getNumero()
				+ " - CEP: " + super.getEndereco().getCep();	
		}
		return resposta;
	}
}
