package curso.java.veolia.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import curso.java.veolia.classes.Aluno;
import curso.java.veolia.classes.DocumentoCpf;
import curso.java.veolia.classes.Endereco;
import curso.java.veolia.classes.OrdenacaoLogradouro;
import curso.java.veolia.classes.OrdenaçãoCPF;

public class AppList03 {
public static void main(String[] args) {
		
	try {
//		List<Endereco> enderecos = new ArrayList<Endereco>();
//		enderecos.add(new Endereco("ggggg Maceio", 151, "aeio José", "88110-300"));
//		enderecos.add(new Endereco("hhhh Augusta", 2847, "aaa Paulo", "01574-330"));
//		enderecos.add(new Endereco("bbbbb Paulista", 1009, "uuu Paulo", "01311-150"));
//		enderecos.add(new Endereco("ddddd Vergueiro", 1974, "eeee Paulo", "04561-150"));
//		enderecos.add(new Endereco("cccc Riachuelo", 35, "iii de Janeiro", "22667-011"));
//		enderecos.add(new Endereco("fffff Maceio", 151, "oooo José", "88110-300"));
//		
//		enderecos.sort(new OrdenacaoLogradouro());
//
//		//enderecos.sort((s1, s2) -> s1.getCidade().compareTo(s2.getCidade()));
//		//Collections.sort(enderecos, new OrdenacaoLogradouro());
//		
//		enderecos.forEach(s -> System.out.println(s.getDados() + "\n"));
//		
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(new DocumentoCpf("44444444444"), "João", "2125"));
		alunos.add(new Aluno(new DocumentoCpf("22222222222"), "Ana", "2126"));
		alunos.add(new Aluno(new DocumentoCpf("66666666666"), "Carlos", "2124"));
		alunos.add(new Aluno(new DocumentoCpf("11111111111"), "Bernardo", "2121"));
		alunos.add(new Aluno(new DocumentoCpf("55555555555"), "Zé", "2122"));
		alunos.add(new Aluno(new DocumentoCpf("33333333333"), "Daniel", "2123"));
		
		//alunos.sort(new OrdenaçãoCPF());
		alunos.sort((x,s) -> x.getDocumento().getNumero().compareTo(s.getDocumento().getNumero()));
		
		
		
		alunos.forEach(s -> System.out.println(s.getDocumento().getNumero() + "\n"));

		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
