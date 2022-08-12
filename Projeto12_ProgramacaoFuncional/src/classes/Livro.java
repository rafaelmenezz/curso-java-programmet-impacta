package classes;

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
		StringBuilder builder = new StringBuilder();
		return builder.append("Titulo: ").append(this.getTitulo())
				.append("\nAutor é instância da classe: ").append(this.getAutor().getClass().getSimpleName())
				.append("\n").append(this.getAutor()).toString();
	}
}
