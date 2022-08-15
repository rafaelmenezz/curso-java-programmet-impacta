package curso.java.veolia.processos;

import java.io.FileReader;

public class ProcessoArquivo implements Runnable{

	@Override
	public void run() {
		abrirArquivo();
		
	}
	
	public synchronized void abrirArquivo() {
		
		System.out.println( "Thread em execução: " + Thread.currentThread().getName());
		
		try {
			FileReader  reader = new FileReader("C:\\");
			while (true) {
				int ch = reader.read();
				if (ch == -1) {
					break;
				}
				System.out.print((char) ch);
				Thread.sleep(150);
			}
			System.out.println();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
