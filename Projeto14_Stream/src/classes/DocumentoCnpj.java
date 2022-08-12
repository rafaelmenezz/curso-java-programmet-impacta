package classes;

import interfaces.Documento;

public class DocumentoCnpj implements Documento{
	
	private String documento;
	
	public DocumentoCnpj(String documento) {
		super();
		this.setNumero(documento);;
	}
	
	@Override
	public void setNumero(String numero) {
		if(numero == null || !numero.matches("[0-9]{14}")) {
			throw new IllegalArgumentException("CNPJ Inválido");
		}
		this.documento = numero;
	}

	@Override
	public String getNumero() {
		return "CNPJ: " + this.documento;
	}
}
