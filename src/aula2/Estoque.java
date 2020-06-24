package aula2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Estoque {
	private ArrayList<Guitarra> guitars;
	
	public Estoque() {
		this.guitars = new ArrayList<Guitarra>();
	}
	
	public void addGuitarra(Guitarra guitarra) {
		this.guitars.add(guitarra);
	}
	
	public Guitarra searchGuitarra(String serialNumber){
		Guitarra guitarra;
		guitarra = null;
		for(int i = 0; i < this.guitars.size(); i++) {
			if(this.guitars.get(i).getSerialNumber().equals(serialNumber)) {
				guitarra = this.guitars.get(i);
				JOptionPane.showMessageDialog(null, "Guitarra encontrada.");
			}else {
				guitarra = null;
				JOptionPane.showMessageDialog(null, "Guitarra NÃO encontrada.");
			}
		}
		
		return guitarra;
	}
}
