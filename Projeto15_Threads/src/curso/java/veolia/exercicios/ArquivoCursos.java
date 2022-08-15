package curso.java.veolia.exercicios;

import java.io.FileWriter;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import classes.Utilitarios;

public class ArquivoCursos {

	public static void main(String[] args) {

		/*
		 * Neste exercício, o programa solicita para o usuário os dados de um curso.
		 * Cada curso informado é armazenado em uma linha do arquivo, no formato:
		 * 
		 * descricao;ch;preco
		 */

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			FileWriter writer = new FileWriter("/home/rafael.meneses/Documentos/treinamento/veolia.csv", true);
			while (true) {
				String descricao = JOptionPane.showInputDialog("Informe a descricao: ");
				String ch = JOptionPane.showInputDialog("Informe a Carga Horária: ");
				double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço: "));

				String linha = descricao + ";" + ch + ";" + preco + "\n";
				writer.write(linha);

				if (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação",
						JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
					break;
				}

			}
			writer.close();
			JOptionPane.showMessageDialog(null, "Lista de cursos criada com sucesso");
		} catch (Exception e) {
			Utilitarios.gerarLog(e.getMessage());
			e.printStackTrace();
		} 
	}
}
