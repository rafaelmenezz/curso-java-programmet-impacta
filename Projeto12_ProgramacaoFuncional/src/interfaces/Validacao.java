package interfaces;

import classes.Pessoa;

@FunctionalInterface
//public interface Validacao<T extends Comparable<? super T>> {
public interface Validacao<T extends Pessoa> {	
	boolean validar(T item);
}
