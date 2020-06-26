package programaGuitarra;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CriarLogin {
	
	private ArrayList<String> dadosCadastro;
	private String path;
	
	public CriarLogin(ArrayList<String> dadosCadastro) {
		this.dadosCadastro = dadosCadastro;
	}
	
	public void gravarArquivos() {
		
		path = "C:\\Users\\SANKHYA\\eclipse-workspace\\login.txt";//use o caminho do seu txt
		int qtdLinhas = 0;
		qtdLinhas = this.dadosCadastro.size();
		
		File file = new File(this.path);
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		
		try {
			fileWriter = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(fileWriter);
			for(int i = 0; i < qtdLinhas; i++) {
				bufferedWriter.newLine();
				bufferedWriter.write(this.dadosCadastro.get(i));
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
				JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");
			}
			catch (IOException e){
				System.out.println("Erro ao Fechar o Arquivo");
				System.err.println(e.getMessage());
			}
		}
	}
}
