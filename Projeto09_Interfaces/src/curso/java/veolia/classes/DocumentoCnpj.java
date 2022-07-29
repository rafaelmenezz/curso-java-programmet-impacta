package curso.java.veolia.classes;

import curso.java.veolia.interfaces.Documento;

public class DocumentoCnpj implements Documento {

	private String documento;

	public DocumentoCnpj(String numero) {
		this.setNumero(numero);
	}

	@Override
	public void setNumero(String numero) {
		if (numero == null || !numero.matches("[0-9{14}]")) {
			throw new IllegalArgumentException("CNPJ inválido");
		}

	}

	@Override
	public String getNumero() {

		return "CNPJ: " + this.documento;
	}

}
