package curso.java.veolia.processos;

import curso.java.veolia.threads.classes.Garrafa;

public class ProcessoTomarCafe02 implements Runnable{
	
	private Garrafa garrafa = new Garrafa(100);

	@Override
	public void run() {

		String nome = Thread.currentThread().getName();
		garrafa.tomarCafe(25);
		System.out.println(nome + " está tomando café. Restam "+ garrafa.getLitros() + " litros.");
		
	}
}
