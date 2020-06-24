package aula3;

import java.util.ArrayList;

public class Main {
	public Main() {
		ArrayList<String> dadosArq; 
		LerArquivoGuitarras lerArquivoGuitarras = new LerArquivoGuitarras();
		lerArquivoGuitarras.lerGuitarras();
		dadosArq = lerArquivoGuitarras.getDados();
		
		String serialNumber = "";
		double price = 0;
		String builder = "";
		String model = "";
		String type = "";
		
		serialNumber = dadosArq.get(0);
		price = Double.parseDouble(dadosArq.get(1));
		builder = dadosArq.get(2);
		model = dadosArq.get(3);
		type = dadosArq.get(4);
		
		Guitarra guitarra = new Guitarra(serialNumber, price, builder, model, type);
		System.out.println(guitarra.getSerialNumber());		
	}
	public static void main(String[] args) {
		Main main = new Main();		
	}
}