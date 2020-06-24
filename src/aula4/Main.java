package aula4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;

public class Main {
///C:\Users\SANKHYA\eclipse-workspace\guitarra.txt
	public Main() {
	    Object opcoes[] = {"Ler","Gravar"};
		int resposta = JOptionPane.showOptionDialog(null,"Deseja abrir um arquivo ou gravar mais guitarras?","Guitarras",1,3, null, opcoes, null);
	    if (resposta == JOptionPane.YES_OPTION) {
			LerArquivoGuitarras lerArquivoGuitarras = new LerArquivoGuitarras();
	    }else {
	    	Scanner scanner = new Scanner(System.in);
	  		String path = "";
	  		ArrayList<String> dados = new ArrayList<String>();
	  		String continua = "s";
//	  		System.out.println("Deseja inserir uma nova quitarra? S - sim | N - nao");
//	  		continua = scanner.nextLine();
	  		if(continua.equals("S") || continua.equals("s")) {
////////////////faz a escolha do arquivo, modo novo
	  			int valorRetorno = 0;
	  			JFileChooser jFileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
	  			valorRetorno = jFileChooser.showOpenDialog(null);
	  			if(valorRetorno == JFileChooser.APPROVE_OPTION) {
	  				File file = jFileChooser.getSelectedFile();
///////////////até aqui, momdo novo
	  				path = file.getAbsolutePath(); //pega o caminho do arquivo selecionado
		  			//System.out.println("Qual o arquivo deseja gravar?"); // modo antigo
		  			//path = scanner.nextLine();                           // modo antigo
//////////////de resto nada mudou
		  				int count = 0;
		  				while(continua.equals("S") || continua.equals("s")) {
		  					System.out.println("Serial Number: ");
		  					String serialNumber = scanner.nextLine();
		  					
		  					System.out.println("Preco: ");
		  					double price = Double.parseDouble(scanner.nextLine());
		  					
		  					System.out.println("Fabricante: ");
		  					String builder = scanner.nextLine();
		  					
		  					System.out.println("Modelo: ");
		  					String model = scanner.nextLine();
		  					
		  					System.out.println("Tipo: ");
		  					String type = scanner.nextLine();
		  					
		  					Guitarra guitarra = new Guitarra(serialNumber, price, builder, model, type);
		  					dados.add(guitarra.getSerialNumber());
		  					dados.add(Double.toString(guitarra.getPrice()));
		  					dados.add(guitarra.getBuilder());
		  					dados.add(guitarra.getModel());
		  					dados.add(guitarra.getType());
		  					
		  					GravarArquivoGuitarras gravarArquivoGuitarras = new GravarArquivoGuitarras(dados, path);
		  					gravarArquivoGuitarras.gravaArquivos();	
		  					count += 1;
		  					System.out.println("Deseja inserir uma nova quitarra? S - sim | N - nao");
		  					continua = scanner.nextLine();
		  				}
		  				System.out.println("Foram gravadas " + count + " guitarras");
		  				scanner.close();
	  			}
	  		}else {
	  			System.out.println("Ok, nada será gravado!");
	  		}
	    	  System.exit(0);
	      }
	    System.exit(0);		
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
	}
}
