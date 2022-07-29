package curso.java.veolia.figuras;

import curso.java.veolia.interfaces.Figura;

public class Retangulo implements Figura{
	
	
	private double base;
	private double altura;
		
	public Retangulo() {}

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		if (base <= 0) {
			throw new NumberFormatException("A base deve ser positiva");
		}
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura <= 0 ) {
			throw new NumberFormatException("A altura deve ser positiva");
		}
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return this.getBase() * this.getBase();
	}


}
