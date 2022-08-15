package classes;

import curso.java.veolia.interfaces.Apresentacao;
import curso.java.veolia.interfaces.ValidacaoGeral;

public class ListaElementos<T> {

	private T[] elementos;
	
	public ListaElementos(T[] elementos) {
		this.setElementos(elementos);
	}
	
	public T[] getElementos() {
		return elementos;
	}

	public void setElementos(T[] elementos) {
		this.elementos = elementos;
	}

	public T buscarElemento(ValidacaoGeral<T> busca) {
		for (T item : elementos) {
			if(busca.validar(item)) {
				return item;
			}
		}
		return null;
	}
	
	public void pesquisarElementos(Apresentacao app) {
		for(T item : elementos) {
			app.executar(item);
		}
	}
}
