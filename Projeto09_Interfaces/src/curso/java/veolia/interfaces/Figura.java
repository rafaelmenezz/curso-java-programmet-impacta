package curso.java.veolia.interfaces;

public interface Figura {

	//em  interfaces, os métodos são públicos e abstratos por definição
	double calcularArea();
	
	// em interfaces, os atributos são públicas, estáticas e final por definição
	String DESENVOLVIDO_POR = "Veolia JTech";
	
	// Na versão 8 do Java foi introduzido o conceito de métodos default:
	// - permanece com a mesma implementação do inicio ao fim
	// - pode ser acessodo por todos os objetos cuja classe implementa a interface
	// - Por definição, um método default é publico
	
	public default String getDados(){
		StringBuilder sb = new StringBuilder();
		sb
		.append("Dados da figura: ")
		.append(this.getClass().getSimpleName())
		.append("\nÁrea").append(this.calcularArea())
		.append('\n').append(DESENVOLVIDO_POR);
		return sb.toString();
	}
}
