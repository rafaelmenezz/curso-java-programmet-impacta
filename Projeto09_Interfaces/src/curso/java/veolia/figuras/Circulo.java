package curso.java.veolia.figuras;

import curso.java.veolia.interfaces.Figura;

public class Circulo implements Figura{
	
	private double raio;
	
	
	public Circulo(double raio) {
		this.setRaio(raio);
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		if (raio <= 0)
			throw new NumberFormatException("O valor do raio deve ser possitivo");
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(this.getRaio(), 2);
	}

}
