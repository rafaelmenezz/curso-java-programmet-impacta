package aplicacao;

import classes.Aluno;
import classes.DocumentoCpf;
import enumerados.Sexo;
import interfaces.Consumo;

public class AppConsumo {

	public static void main(String[] args) {
		// String executar(T item)
		
		Consumo<String> c1 = s -> s.toUpperCase();
		Consumo<Integer> c2 = i -> "Valor: " + i;
		Consumo<Aluno> c3 = a ->  a.toString();
		
		System.out.println(c1.executar("Interface Generica"));
		System.out.println(c2.executar(1234));
		System.out.println(c3.executar(new Aluno(new DocumentoCpf("12345678901"), "Jefferson", 18, Sexo.MASCULINO, "12546")));
		

	}

}
