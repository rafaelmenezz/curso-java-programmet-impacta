package classes;

import enumerados.Sexo;
import interfaces.Documento;

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
		this.salario = salario;
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
