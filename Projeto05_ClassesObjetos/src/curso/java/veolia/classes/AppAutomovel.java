package curso.java.veolia.classes;

public class AppAutomovel {

	public static void main(String[] args) {
		//1
		Automovel auto1 = new Automovel();
		auto1.marca = "VW";
		auto1.modelo = "Tiguan";
		auto1.ano = 2020;
		System.out.println("auto1 _ passo 1: " + auto1);
		
		//2
		Automovel auto2 = new Automovel();
		auto2.marca = "Ford";
		auto2.modelo = "Fusion";
		auto2.ano = 2018;
		System.out.println("autoo 2 - passo2: " +auto2);
		
		//3
		Automovel auto3 = auto1;
		auto3.ano =2022;
		System.out.println("auto3 - passo 3:" + auto3);
		
		//4
		auto1 = auto2;
		System.out.println("auto 1 - passo 4: " + auto1);
		System.out.println("auto 2 - passo 4: " + auto2);
		
		//5
		auto3 = null;
		System.out.println("auto 3 - passo 5:" + auto3);
//		auto1 = null;
		

	}
}
