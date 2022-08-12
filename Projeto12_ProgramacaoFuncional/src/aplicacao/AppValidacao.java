package aplicacao;

import classes.Aluno;
import classes.Funcionario;
import classes.Pessoa;
import enumerados.Sexo;
import interfaces.Validacao;

public class AppValidacao {
	public static void main(String[] args) {
		// boolean validar(T item)
		Validacao<Funcionario> v1;
		
		v1 = s -> s.getIdade() >= 0;
		
		Validacao<Aluno> v2 = s -> s.getCurso().getDescricao().contains("Java");
		
		Validacao<Pessoa>v3 = s -> s.getSexo() == Sexo.FEMININO;
	}
}
