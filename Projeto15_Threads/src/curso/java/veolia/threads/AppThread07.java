package curso.java.veolia.threads;

public class AppThread07 {

	public static void main(String[] args) {
		/*
		 * É possível definir a funcionalidade do método run() em uma tarefa,
		 * no momento da criação da Thread, em forma de expressão lambda
		 * */
		
		//Runnable r = ()-> {...}
		Thread t = new Thread(() -> {
			System.out.println("Thread em execução: " +  Thread.currentThread().getName());
		});
		t.setName("minhaThread");
		
		t.start();
	}
}
