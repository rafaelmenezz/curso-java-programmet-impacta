package curso.java.veolia.interfaces;

import curso.java.veolia.classes.Pessoa;

@FunctionalInterface
public interface Validacao<T extends Pessoa> {

	boolean validar(T item);
}
