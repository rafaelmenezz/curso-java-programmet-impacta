package curso.java.veolia.figuras;

public abstract class  Figura {

	public abstract double calcularArea();
	
	public String getDados() {
		StringBuilder sb = new StringBuilder()
				.append("Informações da figura: ")
				.append(this.getClass().getName())
				.append("\nÁrea").append(this.calcularArea());
		return sb.toString();
	}
	
	/*
	 * No método getDados() definido acima está sendo feita um chamada no método calcularArea() (this.calcularArea()),
	 * que é abstrato.
	 * Na verdade, pelo fato de a classe Figura ser Abstrata, sabemos que ela jamais será instanciada, indicando que o
	 * método calcularArea() chamado garatidamente corresponderá ao objeto da subclasse de Figura. Isso acontece por causa
	 * do Polimorfismo.
	 */
}
