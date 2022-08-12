package classes;

import java.util.Comparator;

public class OrdenacaoLogradouro implements Comparator<Endereco>{

	@Override
	public int compare(Endereco o1, Endereco o2) {
		return o1.getLogradouro().compareTo(o2.getLogradouro());
	}
}
