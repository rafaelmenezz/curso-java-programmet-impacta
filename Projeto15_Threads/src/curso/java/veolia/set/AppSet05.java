package curso.java.veolia.set;

import java.util.LinkedHashSet;
import java.util.Set;

import classes.Endereco;

public class AppSet05 {

	public static void main(String[] args) {
		
		try {
			Endereco e1 = new Endereco("Paulista", 1009, "São Paulo", "02568-952");
			Endereco e2 = new Endereco("B. Faria Lima", 326, "São Paulo", "02568-456");
			Endereco e3 = new Endereco("Paulista", 1009, "São Paulo", "02568-952");
			
			Set<Endereco> enderecos = new LinkedHashSet<Endereco>();
			enderecos.add(e1);
			enderecos.add(e2);
			enderecos.add(e3);
			
			enderecos.forEach(System.out::println);
			//System.out.println(e1.hashCode());
		//	System.out.println(e3.hashCode());
			
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
