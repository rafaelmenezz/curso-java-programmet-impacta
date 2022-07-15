package curso.java.veolia.inteiras;

import javax.swing.JOptionPane;

public class VariaveisInteiras {
	public static void main(String[] args) {
		// <tipo> <nome_da_variavel>; [= valor]   []-> não necessário
		
		//byte b1 = 127; // -128 à 127
		
		byte b1 = 50;
		byte b2 = 50;
		
		byte soma = (byte) (b1 + b2); // typecast
		
		JOptionPane.showMessageDialog(null, "soma (byte): " + soma);
		
		// bases numéricas 
		// todas as operação convertem para o tipo default int
		
		int n1 = 100; 	// base decimal
		int n2 = 0100;	// base octal 
		int n3 = 0x100;	// base hexadecimal
		int n4 = 0b100; // base binário
		
		System.out.println("n1: "+ n1);
		System.out.println("n2: "+ n2);
		System.out.println("n3: "+ n3);
		System.out.println("n4: "+ n4);
	}
}
