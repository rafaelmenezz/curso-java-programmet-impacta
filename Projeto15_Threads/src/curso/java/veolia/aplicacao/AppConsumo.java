package curso.java.veolia.aplicacao;

import curso.java.veolia.classes.Aluno;
import curso.java.veolia.classes.DocumentoCpf;
import curso.java.veolia.enumerados.Sexo;
import curso.java.veolia.interfaces.Consumo;

public class AppConsumo {

	public static void main(String[] args) {
		
		Consumo<String> c1 = s -> s.toUpperCase(); 
		Consumo<Integer> c2 = s -> "Valor: " + s; 
		Consumo<Aluno> c3 = s -> s.toString();
		
		System.out.println(c1.executar("acaba"));
		System.out.println(c2.executar(221));
		System.out.println(c3.executar(new Aluno(new DocumentoCpf("11111111111"), "Jon", 27, Sexo.MASCULINO, "235")));		

	}
}
