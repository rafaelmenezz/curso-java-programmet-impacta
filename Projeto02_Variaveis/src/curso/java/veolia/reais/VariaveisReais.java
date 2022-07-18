package curso.java.veolia.reais;

public class VariaveisReais {
	
	public static void main(String[] args) {
		
		
		float f1 = 100;
		double d1 = 100;
		
		float f2 = 100; // typecast: todo valor é decimal é double p/ o compilador
		double d2 = 100;
		
		float f3 = (float)d2;
		
		System.out.println("f1: "+ f1);
		System.out.println("d1: " + d1);
		System.out.println("f2: "+ f2);
		System.out.println("d2: " + f2);
		System.out.println("f3: " + f3);
	}

}
