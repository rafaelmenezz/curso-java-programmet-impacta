package curso.java.veolia.processos;

public class ProcessoOperacao02 implements Runnable {
	
	private int total;
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public void run() {

		synchronized (this) {
			try {
				for (int i = 0; i < 200; i++) {
					this.setTotal(this.getTotal() + i);
					Thread.sleep(10);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.notify();
		}
		
	}
}
