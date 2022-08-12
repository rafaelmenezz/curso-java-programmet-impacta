package curso.java.veolia.processos;

public class Processo01 implements Runnable{

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
			
				System.out.print("*");
				Thread.sleep(500);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}	
	}

}
