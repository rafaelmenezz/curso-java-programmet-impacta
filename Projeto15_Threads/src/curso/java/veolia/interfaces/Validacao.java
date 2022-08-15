package curso.java.veolia.interfaces;

import classes.Pessoa;

@FunctionalInterface
public interface Validacao<T extends Pessoa> {

	boolean validar(T item);
}
