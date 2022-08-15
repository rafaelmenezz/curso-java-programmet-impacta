package classes;

import java.util.Comparator;

public class OrdenacaoLogradouro implements Comparator<Endereco>{

	@Override
	public int compare(Endereco s1, Endereco s2) {
		return s1.getLogradouro().compareTo(s2.getLogradouro());
	}

}
