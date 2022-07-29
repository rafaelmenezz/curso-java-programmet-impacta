package curso.java.veolia.aplicacao;

import curso.java.veolia.classes.Automovel;

public class AppAutomovel {

	public static void main(String[] args) {
	

		Automovel auto = new Automovel("Fiat", 1975);
		Automovel auto1 = new Automovel("Ford","Fusion", 2018);
		Automovel auto2 = new Automovel("VW", "Gol", 2020);
		
		
		System.out.println(auto.getDados());
		System.out.println();
		System.out.println(auto1.getDados());
		System.out.println();
		System.out.println(auto2.getDados());
		
		
		
		/*
		 * Construtores: regras
		 * 
		 * 1. Construtor é um método que possui o mesmo nome da classe, sem valor de retorno definido
		 * 
		 * 2. Toda classe possui um construtor,mesmo que nã seja definido pelo programador.
		 * 
		 * 3. Se nenhum construtor for definido na classe, o compilador insere o construtor default
		 * 	(sem parâmetros, com o objetivo de iniciar os atributos do objeto com valores padrâo:
		 *  numeros,0, referencias,null, booleanos,false
		 *  
		 *  4. Quando incluimos o nosso proprio construtor, o compilador passa a usa-lo e o default não é mais inserido.
		 *  
		 *  5. Assim como quaisquer métodos, os contrutores podem ser sobrecarregados.
		 *  
		 *  6. O construtor é executado uma unica vez no ciclo de vida do objeto, pelo operador new.
		 */
		
		
		
	}
}
