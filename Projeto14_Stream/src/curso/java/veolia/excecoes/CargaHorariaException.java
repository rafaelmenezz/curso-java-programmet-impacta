package curso.java.veolia.excecoes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CargaHorariaException extends RuntimeException{

	private static final long serialVersionUID = 3262533671553363899L;

	public CargaHorariaException() {
		super();
	}
	public CargaHorariaException(String msg) {
		super(msg);
	}
	
	@Override
	public String getMessage() {
		Date data  = new Date();
		String sData = new SimpleDateFormat("dd//MM/yyyy - HH:mm").format(data);
		return "[" + sData + "]" + super.getMessage();
	}
		
	}
