package curso.java.veolia.threads;

import curso.java.veolia.processos.Processo01;

public class AppThreads02 {
	public static void main(String[] args) {
		
		Processo01 proc1 = new Processo01(); // proc01: tarefa a ser realizada
		Thread t1 = new Thread(proc1);
		t1.start();
		
	}
}
