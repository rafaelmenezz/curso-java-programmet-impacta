package curso.java.veolia.apostila.laboratorio;

public class ThreadLab extends Thread{
	
	public ThreadLab(String x) {
		super(x);
	}
	
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(this.getPriority());
				this.sleep(500);
			}
			
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
