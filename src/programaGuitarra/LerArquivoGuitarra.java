package programaGuitarra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LerArquivoGuitarra {
	private ArrayList<String> dadosGuitarra;
	
	public LerArquivoGuitarra() {
		this.dadosGuitarra = new ArrayList<String>();
	}
	
	public void lerGuitarra() {
		String linha = "";
		String path = "C:\\Users\\SANKHYA\\eclipse-workspace\\guitarra.txt";
		
		try {
			FileReader arq = new FileReader(path);
			BufferedReader lerArq = new BufferedReader(arq);
			linha = lerArq.readLine();		
			this.dadosGuitarra.add(linha);
			while(linha != null) {
				linha = lerArq.readLine();
				this.dadosGuitarra.add(linha);
			}
			arq.close();
		}catch(IOException e) {
			System.out.println("Problemas na leitura do arquivo.");
			System.err.printf("Erro: %s \n", e.getMessage());
		}
		
	}//Fim método
	public ArrayList<String> getDados() {
		return this.dadosGuitarra;
	}
}
