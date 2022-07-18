package curso.java.veolia.referencias;

public class Concatenacoes {
	public static void main(String[] args) {
		String s = "Curso " + "Java";
		s = "Curso Java";
		s = s + " Veolia";

		System.out.println(s);

//		Em Java, toda String é constante. Sendo assim, não existe concatenação 
//		de String no sentido de alterá-la e sim produzindo novas Strings.
//		Havendo a necessidade de concatenarmos várias Strings, devemos pensar
//		na otimização destas concatenações, Para isso, usamos a classe StringBuilder.

		StringBuilder builder = new StringBuilder();
		String s1 = builder.append("Curso ")
							.append("Java")
							.append(" Veolia")
							.toString(); // execução em cadeia
		System.out.println(s1);
	}
}
