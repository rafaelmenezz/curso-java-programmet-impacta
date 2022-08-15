package curso.java.veolia.aplicacao;

import curso.java.veolia.interfaces.Busca;

public class AppBusca {

	public static void main(String[] args) {
		
		Busca b1 = s -> s.length();
		Busca b2 = s ->{
			int cont = 0;
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == 'a') cont++;
			}
			return cont;
		};
		
		System.out.println("b1: " + b1.executar("Java Web"));
		System.out.println("b1: " + b2.executar("Java Web"));
	}
}
