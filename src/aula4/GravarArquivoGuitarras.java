package aula4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class GravarArquivoGuitarras {
	private ArrayList<String> dados;
	private String path;
	
	public GravarArquivoGuitarras(ArrayList<String> dados, String path) {
		this.dados = dados;
		this.path = path;
	}
	
	public void gravaArquivos() {
		int qtdLinhas = 0;
		qtdLinhas = this.dados.size();
		File file = new File(this.path);
		FileWriter fileWriter = null;
		
		BufferedWriter bufferedWriter = null;
		try {
			fileWriter = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(fileWriter);
			for(int i = 0; i < qtdLinhas; i++) {
				bufferedWriter.newLine();
				bufferedWriter.write(this.dados.get(i));
			}
		}catch(IOException e) {
			System.out.println("Erro ao escrever em arquivo.");
			System.err.println(e.getMessage());
		}finally{
			try {
				bufferedWriter.close();
				fileWriter.close();
				System.out.println("Dados salvos com sucesso!");
			}catch(IOException e) {
				System.out.println("Erro ao fechar o arquivo.");
				System.err.println(e.getMessage());
			}
		}
	}
}
