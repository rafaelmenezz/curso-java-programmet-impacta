package curso.java.veolia.aplicacao;

import javax.swing.JOptionPane;

import curso.java.veolia.interfaces.Figura;

public class AppClassesInternas {

	public static void main(String[] args) {
		Figura figura = new Figura(){
			
		/*
		 *	
		 */
			
		// suponha que esta classe interna anônima
			
			@Override
			public double calcularArea() {
				return  10 * Math.random();
			}
		};
		System.out.println(figura.calcularArea());
		
		//usuando o método getFiguraAnonima()
		
		
		
		JOptionPane.showMessageDialog(null, figura);
	}
		
		
}
