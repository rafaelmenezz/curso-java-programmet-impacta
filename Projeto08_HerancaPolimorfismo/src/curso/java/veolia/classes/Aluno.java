package curso.java.veolia.classes;

public class Aluno extends Pessoa {

	private int matricula;
	private Curso curso;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String getDados() {
		StringBuilder text = new StringBuilder();
		text.append(super.getDados())
		.append("\n\nMatrícula: ").append(this.getMatricula())
		.append('\n').append(this.getCurso());
		return text.toString();
	}

	@Override
	public String toString() {
		return super.toString() + ", Curso: " + this.getCurso().getDescricao();
	}
	
	
}
