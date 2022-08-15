package curso.java.veolia.interfaces;

public interface Figura {

	double calcularArea();
	
	String DESENVOLVIDO_POR = "Veolia JTech";
	
	default String getDados(){
		StringBuilder builder = new StringBuilder()
				.append("Dados da figura: ")
				.append(this.getClass().getSimpleName())
				.append("\nÁrea: ")
				.append(this.calcularArea())
				.append("\nDesenvolvido por:")
				.append(Figura.DESENVOLVIDO_POR);
		return builder.toString();
	}
}

