package curso.java.veolia.arquivos;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class GravacaoArquivos {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("/home/jonathan.albuquerque/Documentos/emilio/arquivo1.txt");
			writer.write("Primeiro Arquivo");
			writer.close();
			JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
