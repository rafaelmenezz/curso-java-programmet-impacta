package curso.java.veolia.arquivos;

import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.UIManager;

public class LeituraArquivo02 {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			JFileChooser chooser = new JFileChooser();
			
			if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			FileReader reader = new FileReader(chooser.getSelectedFile());
			StringBuilder builder = new StringBuilder();
			
			while(true) {
				int ch = reader.read();
				if(ch == -1) {
					break;
				}
				builder.append((char)ch);
			}
			System.out.print(builder.toString());
			reader.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
