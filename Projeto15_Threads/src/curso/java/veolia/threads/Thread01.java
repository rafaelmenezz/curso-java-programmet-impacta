package curso.java.veolia.threads;

public class Thread01 extends Thread{
	
	private String valor;
	private Integer tempo;
	
	public Thread01(String valor, Integer tempo) {
		this.valor = valor;
		this.tempo = tempo;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
			
				System.out.print(this.valor);
				Thread.sleep(tempo);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}
}
