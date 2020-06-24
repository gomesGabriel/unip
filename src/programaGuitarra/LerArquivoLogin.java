package programaGuitarra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LerArquivoLogin {
	private ArrayList<String> dadosLogin;
	
	public LerArquivoLogin() {
		dadosLogin = new ArrayList<String>();
		lerLogin();
	}
	
	public void lerLogin() {
		String linha = "";
		String path = "C:\\Users\\SANKHYA\\eclipse-workspace\\login.txt";
		
		try {
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			linha = bufferedReader.readLine();
			this.dadosLogin.add(linha);
			while(linha != null) {
				//System.out.println(linha);
				linha = bufferedReader.readLine();
				this.dadosLogin.add(linha);
			}
			fileReader.close();
		}catch(IOException e){
			System.out.println("Problmas na leitura do arquivo.");
			System.err.printf("Erro %s", e.getMessage());
		}
	}
	
	public ArrayList<String> getDados(){
		return this.dadosLogin;
	}
}
