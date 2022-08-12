package classes;

import interfaces.Documento;

public class DocumentoCpf implements Documento{

	private String documento;
	
	public DocumentoCpf(String documento) {
		super();
		this.setNumero(documento);;
	}

	@Override
	public void setNumero(String numero) {
		if(numero == null || !numero.matches("[0-9]{11}")) {
			throw new IllegalArgumentException("CPF Inválido");
		}
		this.documento = numero;
	}

	@Override
	public String getNumero() {
		return "CPF: " + this.documento;
	}

}
