package curso.java.veolia.processos;

public class ProcessoTomarCafe implements Runnable{

	@Override
	public void run() {
		//String nome = Thread.currentThread().getName().getClass().getName();
		String nome = Thread.currentThread().getName();
		System.out.println(nome + " está tomando café.");
		
	}

}
