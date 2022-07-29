package curso.java.veolia.extra.poo.exercicio20;

public class Ponto {

	private int x;
	private int y;
	
	public void setCoodernadas(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String getCoodernadaPonto(){
		StringBuilder str = new StringBuilder();
		str.append("Coordenada x: ").append(x);
		str.append("Coordenada y: ").append(y);
		
		return str.toString();
	}
}
