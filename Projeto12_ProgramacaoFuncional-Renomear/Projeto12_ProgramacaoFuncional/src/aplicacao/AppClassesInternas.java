package aplicacao;

import interfaces.Figura;

public class AppClassesInternas {

	public static void main(String[] args) {
		
		Figura figura = new Figura() {
			@Override
			public double calcularArea() {
				return 10;
			}
		};
		
		System.out.println(figura.calcularArea());
	}
}
