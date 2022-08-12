package aplicacao;

import interfaces.Busca;

public class AppBusca {

	public static void main(String[] args) {
		// inte executar(String s)
		Busca b1 = item -> item.length();
		
		// retorno: numero de ocorrencias de letra 'a'
		Busca b2 = texto -> {
			int cont = 0;
			for (int i = 0; i < texto.length(); i++) {
				if(texto.charAt(i)=='a') cont++;
			}
			return cont;
		};
		
		System.out.println("b1: " + b1.executar("Java Web"));
		System.out.println("b1: " + b2.executar("Java Web"));
		

	}

}
