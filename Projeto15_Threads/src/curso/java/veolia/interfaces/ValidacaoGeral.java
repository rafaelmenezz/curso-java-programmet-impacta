package curso.java.veolia.interfaces;

@FunctionalInterface
public interface ValidacaoGeral<T> {
	boolean validar(T item);

}
