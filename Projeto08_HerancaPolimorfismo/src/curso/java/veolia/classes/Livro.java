package curso.java.veolia.classes;

public class Livro {

	private String titulo;
	private Pessoa autor;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Pessoa getAutor() {
		return autor;
	}

	public void setAutor(Pessoa autor) {
		this.autor = autor;
	}
	
	public String getDados() {

		StringBuilder text = new StringBuilder();
		text.append("titulo: ").append(this.getTitulo())
		.append("\nAutor: Instancia da classe: " )
		.append(this.getAutor().getClass().getSimpleName())
		.append('\n').append(this.getAutor().getDados());
		return text.toString();
	}
}
