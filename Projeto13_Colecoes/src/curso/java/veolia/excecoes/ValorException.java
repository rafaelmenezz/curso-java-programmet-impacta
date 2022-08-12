package curso.java.veolia.excecoes;

public class ValorException extends Exception{

	private static final long serialVersionUID = -4436223060067332408L;

	public ValorException() {
		super();
	}
	
	public ValorException(String msg) {
		super(msg);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
