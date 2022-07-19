package curso.java.veolia.extra.poo.exercicio18;

/*
 * 	Escreva uma classe chamada Funcionario. Nela, definir como dados membro (atributos): nome, idade, salário
	e cargo. Em seguida, criar:
	- a. Um método capaz de mostrar os dados dos objetos desta classe, incluindo a informação sobre a
	maioridade ou não
	- b. Um método que receba como parâmetros os atributos da classe
 */

public class Funcionario {

	private String nome;
	private int idade;
	private double salario;
	private String cargo;
	
	public Funcionario(){}
	
	public Funcionario(String nome, int idade, double salario, String cargo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.cargo = cargo;
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void imprimaDados() {
		String dados = new StringBuilder()
				.append("Nome: ").append(this.nome)
				.append("\nIdade: " ).append(this.idade)
				.append("\nSalario: ").append(this.salario)
				.append("\nCargo: ").append(cargo)
				.append(idade >= 18 ? "\nDe Maior ": "\nDe Menor")
				.toString();
		
		System.out.println(dados);
	}
	
	
	
	
}
