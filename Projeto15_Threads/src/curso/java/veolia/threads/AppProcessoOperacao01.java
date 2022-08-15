package curso.java.veolia.threads;

import curso.java.veolia.processos.ProcessoOperacao01;

public class AppProcessoOperacao01 {

	public static void main(String[] args) {
		
		ProcessoOperacao01 p1 = new ProcessoOperacao01();
		Thread t = new Thread();
		t.start();
		System.out.println("Valor do atributo 'total': " + p1.getTotal());
		
		
	}
}
