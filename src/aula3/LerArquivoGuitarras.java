package aula3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LerArquivoGuitarras {
	private ArrayList<String> dados;
	
	public LerArquivoGuitarras() {
		this.dados = new ArrayList<String>();
	}
	public void lerGuitarras() {
		String linha = "";
		String path = "";
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual o nome do arquivo?\n");
		path = ler.nextLine();//ler via console
		ler.close();
		try {
			FileReader arq = new FileReader(path);
			BufferedReader lerArq = new BufferedReader(arq);
			linha = lerArq.readLine();
			this.dados.add(linha);
			
			while(linha != null) {
				System.out.println(linha);
				linha = lerArq.readLine();
				this.dados.add(linha);
			}
			arq.close();
		}catch(IOException e){
			System.out.println("Problmas na leitura do arquivo.");
			System.err.printf("Erro %s", e.getMessage());
		}
	}
	
	public ArrayList<String> getDados(){
		return this.dados;
	}
}
