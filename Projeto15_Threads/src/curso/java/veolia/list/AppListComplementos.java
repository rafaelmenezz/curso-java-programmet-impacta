package curso.java.veolia.list;

import java.util.ArrayList;
import java.util.List;

import curso.java.veolia.classes.Aluno;
import curso.java.veolia.classes.DocumentoCpf;
import curso.java.veolia.classes.Funcionario;
import curso.java.veolia.classes.Pessoa;

public class AppListComplementos {

	public static void main(String[] args) {
		
		List<? extends Pessoa> pessoas = new ArrayList<Aluno>();
		
		Aluno aluno = new Aluno(new DocumentoCpf("11111111111"), "Jose", 20, "120");
		
		//pessoas.add(aluno);
		
		Pessoa[] pessoas1 = new Aluno[3];
		pessoas1[0] = new Funcionario(new DocumentoCpf("11111111111"), "Maria", "secretária",5000);
	}
}
