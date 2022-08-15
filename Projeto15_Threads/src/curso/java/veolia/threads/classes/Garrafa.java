package curso.java.veolia.threads.classes;

public class Garrafa {
	
	private double litros;
	
	public Garrafa(double litros) {
		this.setLitros(litros);
	}
	
	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	
	public void tomarCafe(double quantidade) {
		this.setLitros(this.litros - quantidade);
	}
}
