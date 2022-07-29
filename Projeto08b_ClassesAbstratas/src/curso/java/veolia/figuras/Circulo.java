package curso.java.veolia.figuras;

public class Circulo extends Figura {
	
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
		// TODO Auto-generated method stub
		return 0;
	}

}
