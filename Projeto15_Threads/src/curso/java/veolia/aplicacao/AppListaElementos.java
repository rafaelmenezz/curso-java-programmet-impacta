package curso.java.veolia.aplicacao;

import classes.ListaElementos;

public class AppListaElementos {

	public static void main(String[] args) {
		
		String[] nomes = {"Janete", "Antonieta", "Mirosmar", "Riedson", "Clara", "Ramiro"};
		ListaElementos<String> lista = new ListaElementos<String>(nomes);
		
		String item = lista.buscarElemento(s -> s.endsWith("a"));
		System.out.println("Item encontrado: " + item);
		
		System.out.println("--------------");
		
		lista.pesquisarElementos(s -> System.out.println(s));
	}
}
