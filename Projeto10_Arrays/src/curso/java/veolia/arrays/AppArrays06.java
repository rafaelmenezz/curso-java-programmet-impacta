package curso.java.veolia.arrays;

public class AppArrays06 {

	public static void main(String[] args) {
		
		double [][] notas = new double [3][];
		
		double [] disc1 = {3.5, 9.5, 10, 4.0};
		double [] disc2 = {2.5, 4.5};
		double [] disc3 = {8, 9, 6, 7, 5, 4, 10, 9};
		
		notas[0] = disc1;
		notas[1] = disc2;
		notas[2] = disc3;
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(" [" + notas[i][j]+"]");
			}
			System.out.println();
		}
	}
}
