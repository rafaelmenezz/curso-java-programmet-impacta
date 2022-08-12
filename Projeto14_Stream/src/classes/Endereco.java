package classes;

import java.util.Objects;

public class Endereco {

	private String logradouro;
	private int numero;
	private String cidade;
	private String cep;

	public Endereco(String logradouro, int numero, String cidade, String cep) throws NoSuchFieldException, NoSuchMethodException {
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setCidade(cidade);
		this.setCep(cep);
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) throws NoSuchFieldException, NoSuchMethodException {
		if(logradouro == null) {
			throw new NullPointerException("Logradouro não fornecido");
		}
		if(logradouro.trim().length() == 0) {
			throw new NoSuchFieldException("Logradouro sem valor");
		}
		if(logradouro.trim().length() > 60) {
			throw new NoSuchMethodException("O logradouro deve ter no máximo 60 caracteres");
		}
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getDados() {
		StringBuilder builder = new StringBuilder("Dados do Endereço: ");
		return builder.append("\nLogradouro: ").append(this.getLogradouro())
				.append("\nNumero: ").append(this.getNumero())
				.append("\nCidade: ").append(this.getCidade())
				.append("\nCEP: ").append(this.getCep()).toString();
	}
	
	@Override
	public String toString() {
		
		return this.getLogradouro();
	}

	@Override
	public int hashCode() {
		return Objects.hash(cep, cidade, logradouro, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(cep, other.cep) && Objects.equals(cidade, other.cidade)
				&& Objects.equals(logradouro, other.logradouro) && numero == other.numero;
	}
	
	
}
