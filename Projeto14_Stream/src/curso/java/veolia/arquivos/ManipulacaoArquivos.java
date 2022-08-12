package curso.java.veolia.arquivos;

import java.io.File;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ManipulacaoArquivos {

	public static void main(String[] args) {
		try {
			String path = "/home/jonathan.albuquerque/";
			File file = new File(path);
			String[] conteudo = file.list();

			for (String item : conteudo) {
				File elemento = new File(path + item);
				String opcao = elemento.isDirectory() ? "[pasta] " : "[arquivo] ";
				System.out.println(opcao + item);
			}
			System.out.println("-".repeat(50));
			
			//FileSystem fs = FileSystems.getDefault();
			Path caminho = Paths.get("/home/jonathan.albuquerque/");
			DirectoryStream<Path> stream = Files.newDirectoryStream(caminho);
		//	List<String> lista = Files.readAllLines(caminho);
			for (Path item : stream) {
				System.out.println(item);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
