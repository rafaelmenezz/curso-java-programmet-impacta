package interfaces;

@FunctionalInterface
public interface ValidacaoGeral<T> {
	boolean validar(T item);

}
