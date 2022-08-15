package classes;

import java.util.Comparator;

public class OrdenaçãoCPF implements Comparator<Aluno>{
@Override
public int compare(Aluno o1, Aluno o2) {
	// TODO Auto-generated method stub
	return o1.getDocumento().getNumero().compareTo(o2.getDocumento().getNumero());
}
	
	
}
