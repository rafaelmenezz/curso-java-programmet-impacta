package curso.java.veolia.extra.poo.exercicio19;

public class Conta {

	private String cliente;
	private String numeroConta;
	private int tipoConta;
	private double limiteCredito;
	private double saldo;
	
	
	public Conta() {
		super();
	}


	public Conta(String cliente, String numeroConta, int tipoConta, double limiteCredito, double saldo) {
		super();
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
		this.limiteCredito = limiteCredito;
		this.saldo = saldo;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public String getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}


	public int getTipoConta() {
		return tipoConta;
	}


	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}


	public double getLimiteCredito() {
		return limiteCredito;
	}


	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}


	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void saque(double valor) {
		if (this.saldo > valor && valor > 0) {
			this.saldo = this.saldo + valor;
		}
	}
	
	public void deposito(double valor) {
		if (valor > 0) {
			this.saldo = this.saldo - valor;
		}
		
	}
	
	public void extrato() {
	
		StringBuilder str = new StringBuilder();
		
		str.append("Cliente: ").append(this.cliente);
		str.append('\n').append("Numero da Conta: ").append(this.numeroConta);
		str.append('\n').append("Tipo de Conta: ").append(this.tipoConta);
		str.append('\n').append("Limite Crédito: ").append(this.limiteCredito);
		str.append('\n').append("Saldo: ").append(this.saldo);
		
		if (this.tipoConta == 2) {
			str.append('\n').append("Saldo total: ").append(this.saldo + this.limiteCredito);
		}
		
		System.out.println(str.toString());
		
		
	}
	
}
