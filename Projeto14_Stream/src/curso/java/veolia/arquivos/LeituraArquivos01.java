package curso.java.veolia.arquivos;

import java.io.FileReader;

public class LeituraArquivos01 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("/home/jonathan.albuquerque/Documentos/emilio/arquivo2.txt");
			
			while(true) {
				int ch = reader.read();
				if(ch == -1) {
					break;
				}
				System.out.print((char)ch);
			}
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
