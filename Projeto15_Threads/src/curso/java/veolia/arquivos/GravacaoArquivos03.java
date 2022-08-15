package curso.java.veolia.arquivos;

import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class GravacaoArquivos03 {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			JFileChooser chooser = new JFileChooser();
			int opcao = chooser.showSaveDialog(null);
			
			if(opcao == JFileChooser.APPROVE_OPTION) {
				String nome = JOptionPane.showInputDialog("Informe um nome: ");
				FileWriter writer = new FileWriter("/home/rafael.meneses/Documentos/treinamento/arquivo2.txt", true);
				writer.write(nome + '\n');
				writer.close();
				JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
