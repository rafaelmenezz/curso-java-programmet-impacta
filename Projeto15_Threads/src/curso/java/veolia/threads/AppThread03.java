package curso.java.veolia.threads;

import curso.java.veolia.processos.ProcessoTomarCafe;

public class AppThread03 {

	public static void main(String[] args) {
		
		ProcessoTomarCafe prc = new ProcessoTomarCafe();
		Thread douglas = new Thread(prc);
		douglas.setName("Douglas");
		
		Thread felipe = new Thread(prc, "Felipe");
		
		Thread erick = new Thread(prc);
		erick.setName("Erick");
		
		Thread luana = new Thread(prc);
		luana.setName("Luana");
		
		douglas.start();
		luana.start();
		erick.start();
		felipe.start();
		
	}
}
