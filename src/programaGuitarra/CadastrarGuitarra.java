package programaGuitarra;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CadastrarGuitarra {
	private ArrayList<String> dadosGuitarra;
	private String path;
	
	public CadastrarGuitarra(ArrayList<String> dadosGuitarra) {
		this.dadosGuitarra = dadosGuitarra;
	}
	
	public void gravarArquivos() {
		
		path = "C:\\Users\\SANKHYA\\eclipse-workspace\\guitarra.txt";//use o caminho do seu txt
		int qtdLinhas = 0;
		qtdLinhas = this.dadosGuitarra.size();
		
		File file = new File(this.path);
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		
		try {
			fileWriter = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(fileWriter);
			for(int i = 0; i < qtdLinhas; i++) {
				bufferedWriter.newLine();
				bufferedWriter.write(this.dadosGuitarra.get(i));
			}
		}
		catch(IOException e){
			System.out.println("Erro ao Escrever em Arquivo");
			System.err.println(e.getMessage());
		}
		finally {
			try {
				bufferedWriter.close();
				fileWriter.close();
				JOptionPane.showMessageDialog(null, "Guitarra Cadastrada com sucesso!");
			}
			catch (IOException e){
				System.out.println("Erro ao Fechar o Arquivo");
				System.err.println(e.getMessage());
			}
		}
	}
}
