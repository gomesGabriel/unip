package aula4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

public class LerArquivoGuitarras {
	public LerArquivoGuitarras() {
		String linha = "";
		int valorRetorno = 0;
		
		JFileChooser jFileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		valorRetorno = jFileChooser.showOpenDialog(null);
		
		if(valorRetorno == JFileChooser.APPROVE_OPTION) {
			File file = jFileChooser.getSelectedFile();
			System.out.println(file.getAbsolutePath());
			try {
				FileReader fileReader = new FileReader(file.getCanonicalPath());
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				linha  = bufferedReader.readLine();
				
				while(linha != null) {
					System.out.println(linha);
					linha = bufferedReader.readLine();
				}
				bufferedReader.close();
				fileReader.close();
				
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Não foi possivel abrir o arquivo.");
				System.err.println(e.getMessage());
			}
		}
	}
}
