package curso.java.veolia.classes;

import java.text.NumberFormat;

public class Funcionario extends Pessoa {

	private String cargo;
	private double salario;

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
