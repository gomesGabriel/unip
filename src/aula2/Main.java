package aula2;

import javax.swing.JOptionPane;

public class Main {
	
	public Main() {
		String serialNumber = JOptionPane.showInputDialog("Qual o serial number?");
		double price = Double.parseDouble(JOptionPane.showInputDialog("Qual o preco?"));
		String builder = JOptionPane.showInputDialog("Qual o fabricante?");
		String model = JOptionPane.showInputDialog("Qual o modelo da guitarra?");
		String type = JOptionPane.showInputDialog("Qual o tipo?");
		
		Guitarra guitarra = new Guitarra(serialNumber, price, builder, model, type);
		
		Estoque estoque = new Estoque();
		estoque.addGuitarra(guitarra);
		Guitarra guitarraBuscada;
		guitarraBuscada = estoque.searchGuitarra(JOptionPane.showInputDialog("Qual o serial number a ser buscado?"));
		JOptionPane.showMessageDialog(null, "Preço da guitarra buscada: "+guitarraBuscada.getPrice());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
	}
}
