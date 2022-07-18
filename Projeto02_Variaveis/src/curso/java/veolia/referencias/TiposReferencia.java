package curso.java.veolia.referencias;

public class TiposReferencia {
	
	public static void main(String[] args) {
		
		String curso = "Java";
		String curso2 = "Java";
		
		int duracao = 100;
		
		boolean b1 = duracao  == 100;
		boolean b2 = curso == curso2;
		
		// compração de igualdade entre dados 
		
		System.out.println("curso: " + curso );
		System.out.println("duracao: " + duracao );
		System.out.println("b1: " + b1 );
		System.out.println("b2: " + b2 );
		
		//Definido novo objetos String de forma explicita
		
		String curso3 = new String("Java");
		String curso4 = new String("Java");
		boolean b3 = curso3 == curso4;
		
		System.out.println("b3: " + b3 );
		System.out.println("curso3: " + curso3 );
		System.out.println("curso4: " + curso4 );
		
		// E se houver a necessidade de comprararmos duas  String?
		// Usamos o método equals()
		boolean b4 = curso3.equals(curso4);
		System.out.println("b4 : " + b4) ;
		
		
		

		
	}

}
