package curso.java.veolia.exercicio;


/*
 	Criar um programa que incremente uma variável inteira iniciando em 0 e terminando em 50, mostrando os
	valores múltiplos de 8, o número da ocorrência em cada exibição e quantas vezes o múltiplo ocorreu.
 */

public class Exercicio13 {
	
	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder();
		int ocorrencia = 0;
		
		System.out.println("_______________________________________");
		System.out.println();
		for (int i = 0; i <= 50 ; i++) {
			
			if (i%8==0 ) {
				ocorrencia++;
				str.append(ocorrencia);
				str.append('°');
				str.append(" Ocorrencia = " );
				str.append(i);
				str.append('\n');
			}
			
		}
		str.append("Quantidade de Ocorrência: ");
		str.append(ocorrencia);
		
		System.out.println(str.toString());
	}

}
