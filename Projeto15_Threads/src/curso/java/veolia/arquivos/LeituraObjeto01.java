package curso.java.veolia.arquivos;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import curso.java.veolia.classes.Curso;

public class LeituraObjeto01 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = 
					new FileInputStream("/home/rafael.meneses/Documentos/treinamento/cursonovo.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Curso c = (Curso)ois.readObject();
			System.out.println("Código: " + c.getCodigo());
			System.out.println("Descrição: " + c.getDescricao());
			System.out.println("Carga Horária: " + c.getCh());
			System.out.println("Preço: " + c.getPreco());
			
			fis.close();
			ois.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
