package classes;

import curso.java.veolia.interfaces.Figura;

public class Circulo implements Figura{

	double raio;
	
	public Circulo(double raio) {
		super();
		this.setRaio(raio);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		if(raio <= 0) {
			throw new NumberFormatException("O raio deve ser positivo");
		}
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return (this.getRaio()*this.getRaio()*Math.PI);
	}

}
