package curso.java.veolia.processos;

public class ProcessoOperacao01 implements Runnable{

	private int total;
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public void run() {

		for (int i = 0; i < 200; i++) {
			this.setTotal(this.getTotal() + i);
		}
		
	}

}
