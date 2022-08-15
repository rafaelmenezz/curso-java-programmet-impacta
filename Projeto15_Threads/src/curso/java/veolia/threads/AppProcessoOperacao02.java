package curso.java.veolia.threads;

import curso.java.veolia.processos.ProcessoOperacao02;

public class AppProcessoOperacao02 {

	public static void main(String[] args) {
		
		ProcessoOperacao02 p1 = new ProcessoOperacao02();
		Thread t = new Thread(p1);
		t.start();
		
		synchronized (t) {
			try {
				System.out.println("Aguardando ....");
				t.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Valor do atributo 'total': " + p1.getTotal());
		}
	}
}
