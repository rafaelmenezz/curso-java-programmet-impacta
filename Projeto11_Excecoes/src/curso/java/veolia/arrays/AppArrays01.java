package curso.java.veolia.arrays;

public class AppArrays01 {

	public static void main(String[] args) {
		
		int[] numeros = {12, 10, 25, 46, 11};
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("[" + numeros[i] + "]");
		}
		
		System.out.println();
		
		int[] numeros2 = new int[] {13, 11, 26, 47, 12};
		for (int i : numeros2) {
			System.out.print("[" + i + "]");
		}
		
		System.out.println();

		int [] numeros3;
		numeros3 = new int[] {14, 12, 27, 48, 13};
		for (int i = numeros3.length-1; i >= 0; i--) {
			System.out.print("[" + numeros3[i] + "]");
		}
		}
}
