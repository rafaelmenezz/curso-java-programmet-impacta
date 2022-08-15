package curso.java.veolia.threads;

//import curso.java.veolia.processos.ProcessoTomarCafe;
import curso.java.veolia.processos.ProcessoTomarCafe02;

public class AppThread05 {

	public static void main(String[] args) {
		/*
		 * Uso do método join(); este método é aplicado à thread, com o objetivo de informar o agendador
		 * de tarefas quie ele terá o controle do agendamento até ser finalizado, 
		 * ou seja, até set iniciado totalmente.
		 * */
		
		try {
			ProcessoTomarCafe02 prc = new ProcessoTomarCafe02();
			Thread douglas = new Thread(prc);
			douglas.setName("Douglas");
			
			Thread felipe = new Thread(prc, "Felipe");
			
			Thread erick = new Thread(prc);
			erick.setName("Erick");
			
			Thread luana = new Thread(prc);
			luana.setName("Luana");
			
			douglas.start();
			douglas.join();
			
			luana.start();
			luana.join();
			
			erick.start();
			erick.join();
			
			felipe.start();
			felipe.join();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
