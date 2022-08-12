package curso.java.veolia.threads;

public class AppThread01 {
	public static void main(String[] args) {
		
		Thread01 t1 = new Thread01("#",500);
		t1.start();
		
		Thread01 t2 = new Thread01(".", 100);
		t2.start();
		

		
	}
}
