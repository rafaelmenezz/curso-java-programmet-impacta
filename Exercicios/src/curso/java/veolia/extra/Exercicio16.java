package curso.java.veolia.extra;

public class Exercicio16 {
	
	public static void main(String[] args) {
		
		int[] n = {100, 500, 1000, 2000};
		double e;
		
		
		for (int i = 0; i < n.length; i++) {
		
			e = Math.pow((1+1/ (double) n[i]), (double) n[i]);
			
			System.out.println(e);
		}
	}

}
