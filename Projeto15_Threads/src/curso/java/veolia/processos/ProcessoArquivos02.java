package curso.java.veolia.processos;

import java.io.FileReader;

public class ProcessoArquivos02 implements Runnable {
	@Override
	public void run() {
		abrirArquivo();

	}

	/*
	 * Bloco sicronizado : ideal para sincronizar apenas o trecho o bloco de código
	 * necessário para garantir o bom funcionamento da aplicação. Sincronizar todo o
	 * método desnecessariamente pode acarretar em perda de desempenho, uma vez que
	 * o processo de sicronismo sobrecarrega o JVM.
	 */
	public void abrirArquivo() {

		System.out.println("Thread em execução: " + Thread.currentThread().getName());

		try {
			FileReader reader = new FileReader("C:\\");
			synchronized (this) {
				while (true) {
					int ch = reader.read();
					if (ch == -1) {
						break;
					}
					System.out.print((char) ch);
					Thread.sleep(150);
				}
				System.out.println();
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
