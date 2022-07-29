package curso.java.veolia.aplicacao;

import curso.java.veolia.figuras.Circulo;
import curso.java.veolia.figuras.Figura;
import curso.java.veolia.figuras.Retangulo;

public class AppFigura {

	public static void main(String[] args) {
		Figura f1 = new Retangulo(3, 5);
		Figura f2 = new Circulo(2);
		
		mostrarFigura(f1);
		mostrarFigura(f2);
	}
	
	private static void mostrarFigura(Figura figura) {
		double area = figura.calcularArea();
	}
}
