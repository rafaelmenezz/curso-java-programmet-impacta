package aplicacao;

import classes.Aluno;
import classes.Curso;
import classes.DocumentoCpf;
import classes.Funcionario;
import classes.Pessoa;
import enumerados.Sexo;
import interfaces.Validacao;

public class AppValidacao {

	public static void main(String[] args) {
		
		try {
			Validacao<Funcionario> v1;
			v1 = s -> s.getIdade() >= 0;
			
			Validacao<Aluno> v2 = s -> s.getCurso().getDescricao().contains("Java");
			
			Validacao<Pessoa> v3 = s -> s.getSexo() == Sexo.FEMININO;
			
			Funcionario f = new Funcionario(new DocumentoCpf("22222222222"), "Abel","Pescador", 5000);
			f.setSexo(Sexo.MASCULINO);
			System.out.println("v1: " + v1.validar(f));
			
			Aluno a = new Aluno(new DocumentoCpf("33333333333"), "Jozias", "1500");
			a.setSexo(Sexo.MASCULINO);
			a.setCurso(new Curso("Java Programmer", 100, 10000));
			System.out.println("v2: " + v2.validar(a));
			
			System.out.println("v3-1: " + v3.validar(f));
			System.out.println("v3-2: " + v3.validar(a));
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
