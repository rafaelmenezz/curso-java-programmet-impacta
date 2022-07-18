package curso.java.veolia.caracteres;

import javax.swing.JOptionPane;

public class VariaveisChar {

	public static void main(String[] args) {
		
		char ch1 = 'x';
		char ch2 = 65;
		char ch3 = 0x062;
		
		int n = 99;
		char ch4 = (char)n;
		
		char ch5 = '\n';
		char ch6 = 27554;
		char ch7 = 136;
		
		System.out.println("ch1: " + ch1);
		System.out.println("ch5: " + ch5);
		System.out.println("ch2: " + ch2);
		System.out.println("ch3: " + ch3);
		System.out.println("ch4: " + ch4);
		System.out.println("ch6: " + ch6);
			
		JOptionPane.showMessageDialog(null,"ch6: " + ch7);
		
	}
}
