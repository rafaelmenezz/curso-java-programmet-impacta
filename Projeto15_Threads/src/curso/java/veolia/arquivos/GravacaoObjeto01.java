package curso.java.veolia.arquivos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import classes.Curso;

public class GravacaoObjeto01 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = 
					new FileOutputStream("/home/rafael.meneses/Documentos/treinamento/cursonovo.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Curso curso = new Curso("Spring Boot", 60, 3000);
			oos.writeObject(curso);
			System.out.println("Objeto criado com sucesso");
			oos.close();
			fos.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}
