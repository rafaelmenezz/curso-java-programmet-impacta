package curso.java.veolia.aplicacao;

import classes.Aluno;
import classes.Curso;
import classes.DocumentoCpf;
import classes.Pessoa;
import curso.java.veolia.enumerados.Sexo;
import curso.java.veolia.interfaces.Apresentacao;

public class AppApresentacao {

	public static void main(String[] args) {
		
		Apresentacao ap1 = s -> System.out.println(s.toString());
		
		Apresentacao ap2 = s -> System.out.println
				(s instanceof Pessoa ? ((Pessoa)s) : "Não é uma pessoa");
		
		try {
			ap1.executar(new Curso("Java", 100, 1000));
			ap2.executar(new Aluno(new DocumentoCpf("11111111111"), "Jefferson", 20, Sexo.MASCULINO, "120"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
