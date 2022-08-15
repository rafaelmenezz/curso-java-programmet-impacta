package curso.java.veolia.threads;

import curso.java.veolia.processos.ProcessoArquivos02;

public class AppThreadArquivos02 {

	public static void main(String[] args) {
		ProcessoArquivos02 arquivos = new ProcessoArquivos02();
		
		Thread t1 = new Thread(arquivos);
		t1.start();
	}
}
