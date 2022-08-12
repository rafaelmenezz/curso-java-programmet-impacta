package curso.java.veolia.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

import javax.swing.JOptionPane;

public class AppMap01 {

	public static void main(String[] args) {
		
		Map<Integer, String> cursos = new HashMap<Integer, String>();
		
		cursos.put(123, ".NET");
		cursos.put(122, "Java");
		cursos.put(124, "Angular");
		
		for (Map.Entry<Integer, String> item : cursos.entrySet()) {
			System.out.println(item.getKey() + ": " + item.getValue());
		}
		System.out.println();

		cursos.forEach((k,v) -> System.out.println(k + ": " + v));
		
		int chave = Integer.parseInt(JOptionPane.showInputDialog("Informe o código: "));
		
		if(cursos.containsKey(chave)) {
			String valor = cursos.get(chave);
			System.out.println("Valor associado ao código: " + valor);
		} else {
			System.out.println("Nenhum curso encontrado");
		}
	}
}
