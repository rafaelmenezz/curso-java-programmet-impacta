package curso.java.veolia.classes;

import curso.java.veolia.interfaces.Documento;

public class DocumentoCpf implements Documento{

	private String documento;
	
	public DocumentoCpf(String numero) {
		this.setNumero(numero);
	}
	
	@Override
	public void setNumero(String numero) {
		if (numero == null || !numero.matches("[0-9]{11}")) {
			throw new IllegalArgumentException("CPF inválido");
		}
		this.documento = numero;
	}

	@Override
	public String getNumero() {
		
		return "CPF: " + this.documento;
	}

}
