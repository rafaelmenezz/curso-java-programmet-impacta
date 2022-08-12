package curso.java.veolia.arquivos;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class GravacaoArquivos02 {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("/home/jonathan.albuquerque/Documentos/emilio/arquivo2.txt", true);
			String nome = JOptionPane.showInputDialog("Informe um nome: ");
			writer.write(nome + '\n');
			writer.close();
			JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
