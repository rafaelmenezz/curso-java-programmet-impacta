package curso.java.veolia.classes;

public class Automovel {

	private String marca;
	private String modelo;
	private int ano;
		
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		
		/*
		 * se a marca for nula (null), a segunda verificação
		 * não é realizada porque a primeira já fornece o valor true,
		 * graças ao mecanismo de 'short circuit' do operador ||. 
		 */
		
		if (marca == null || marca.equals("")) {
			throw new IllegalArgumentException("Marca inválida");
		}
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if (modelo == null || modelo.equals("")) {
			throw new IllegalArgumentException("Modelo inválida");
		}
		this.modelo = modelo;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAno() {
		if(ano < 1970) {
			throw new NumberFormatException("Digita um numero aí, burrao");
		}
		return this.ano;
	}
	
	public void setDados(String marca, String modelo, int ano) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
	}
	
	
	/*
	 * Sobrecarga (overload) de métodos: consiste na definição de métodos com o mesmo nome,
	 * retorno covariante e lista de paramentros diferentes
	 * (quantidade e/ou tipo)
	 */
	public String getDados() {
		return this.getDados("Dados do automóvel:");
	}

	public String getDados(String titulo) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(titulo)
		.append("\nMarca: " ).append(this.getMarca())
		.append("\nModelo: ").append(this.getModelo())
		.append("\nAno: ").append(this.getAno());
		return sb.toString();
	}
	
	
}
