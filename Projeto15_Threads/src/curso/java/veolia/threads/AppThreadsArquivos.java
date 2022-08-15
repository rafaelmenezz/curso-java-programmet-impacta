package curso.java.veolia.threads;

import curso.java.veolia.processos.ProcessoArquivo;

public class AppThreadsArquivos {
	public static void main(String[] args) {
		ProcessoArquivo arquivos = new ProcessoArquivo();
		
		Thread t1 = new Thread(arquivos);
		t1.start();
	}
}
