package curso.java.veolia.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import classes.Endereco;
import classes.OrdenacaoLogradouro;

public class AppList03 {
public static void main(String[] args) {
		
	try {
		List<Endereco> enderecos = new ArrayList<Endereco>();
		enderecos.add(new Endereco("Rua Maceio", 151, "São José", "88110-300"));
		enderecos.add(new Endereco("Rua Augusta", 2847, "São Paulo", "01574-330"));
		enderecos.add(new Endereco("Av Paulista", 1009, "São Paulo", "01311-150"));
		enderecos.add(new Endereco("Rua Vergueiro", 1974, "São Paulo", "04561-150"));
		enderecos.add(new Endereco("Rua Riachuelo", 35, "Rio de Janeiro", "22667-011"));

		
		enderecos.sort((s1, s2) -> s1.getCidade().compareTo(s2.getCidade()));
		//Collections.sort(enderecos, new OrdenacaoLogradouro());
		
		enderecos.forEach(s -> System.out.println(s.getDados() + "\n"));
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
