package aplicacao;

import interfaces.Operacao;

public class AppOperacao {

	public static void main(String[] args) {
		
		Operacao op = (x, y) -> x / y;
		Operacao op2 = (a, b) -> a*b+10;
		Operacao op3 = (x,y) -> {
			double n = Math.random();
			return x+y+n;
		};
		
		
		System.out.println("OP1: " + op.calcular(10, 3));
		System.out.println("OP1: " + op2.calcular(10, 3));
		System.out.println("OP1: " + op3.calcular(10, 3));
	}
}
