package aplicacao;

import classes.Aluno;
import classes.Curso;
import classes.DocumentoCpf;
import classes.Pessoa;
import enumerados.Sexo;
import interfaces.Apresentacao;

public class AppApresentacao {
	public static void main(String[] args) {
		// void executar(Object)
		Apresentacao ap1 = s -> System.out.println(s.toString());
		
		Apresentacao ap2 = s -> System.out.println(s instanceof Pessoa ? ((Pessoa)s) : "Não é uma pessoa");
		
		try {
			ap1.executar(new Curso ("Java", 100, 1000));
			ap2.executar(new Aluno(new DocumentoCpf("12345678901"), "Jefferson", 20, Sexo.MASCULINO, "120"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
