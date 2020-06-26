package jogoDaVelha;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class JogoDaVelha extends JFrame{
	public JPanel jPanel;
	public JLabel jLabel;
	public ArrayList<Botao> botoes;
	
	public static final int jogador_1 = 1;
	public static final int jogador_2 = 2;
	public int vez = jogador_1;
	
	public ImageIcon iconBolinha = new ImageIcon(getClass().getResource("bolinha.png")); //pega as imagens elas devem estar na mesma pasta que o .java
	public ImageIcon iconXizinho = new ImageIcon(getClass().getResource("xizinho.png"));//pega as imagens elas devem estar na mesma pasta que o .java
	
	public Boolean vitoria = false;
	
	public JogoDaVelha() {
		this.configuracaoPrincipal();
		
		this.jLabel = new JLabel();
		this.jLabel.setText("Jogador: " + Integer.toString(vez));
		this.jLabel.setFont(new Font("Courier New", Font.BOLD, 20));
		this.jLabel.setForeground(Color.BLACK);
		this.jLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.jLabel.setVerticalAlignment(SwingConstants.CENTER);
		this.add(BorderLayout.NORTH, this.jLabel);
		
		this.jPanel = new JPanel();
		this.jPanel.setLayout(new GridLayout(3, 3, 10, 10));
		this.jPanel.setBackground(Color.black);
		this.botoes = new ArrayList<Botao>();
		for(int i = 0; i < 9; i++) {
			Botao botao = new Botao(i);
			this.botoes.add(botao);
			this.jPanel.add(botao);
		}
		this.add(BorderLayout.CENTER,this.jPanel);
	}
	
	private void configuracaoPrincipal() {
		this.setLayout(new BorderLayout());
		this.setTitle("Jogo da Velha");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public boolean checkWinner(int jogador) { //checa o vencedor
		if(this.botoes.get(0).jogador == jogador && this.botoes.get(1).jogador == jogador && this.botoes.get(2).jogador == jogador) {
			return true;
		}else if(this.botoes.get(3).jogador == jogador && this.botoes.get(4).jogador == jogador && this.botoes.get(5).jogador == jogador){
			return true;
		}else if(this.botoes.get(6).jogador == jogador && this.botoes.get(7).jogador == jogador && this.botoes.get(8).jogador == jogador){
			return true;
		}else if(this.botoes.get(0).jogador == jogador && this.botoes.get(4).jogador == jogador && this.botoes.get(8).jogador == jogador){
			return true;
		}else if(this.botoes.get(2).jogador == jogador && this.botoes.get(4).jogador == jogador && this.botoes.get(6).jogador == jogador){
			return true;
		}else if(this.botoes.get(0).jogador == jogador && this.botoes.get(3).jogador == jogador && this.botoes.get(6).jogador == jogador){
			return true;
		}else if(this.botoes.get(1).jogador == jogador && this.botoes.get(4).jogador == jogador && this.botoes.get(7).jogador == jogador){
			return true;
		}else if(this.botoes.get(2).jogador == jogador && this.botoes.get(5).jogador == jogador && this.botoes.get(8).jogador == jogador){
			return true;
		}else {
			return false;	
		}	
	}
	
	private class Botao extends JButton implements ActionListener{
		int id = 0;
		int jogador = 100;
		boolean click;
		
		public Botao(int id) {
			this.id = id;
			this.click = false;
			this.setBackground(Color.gray);
			//this.setText(Integer.toString(id));
			this.addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(!this.click) {
				if(vez == jogador_1) {
					this.jogador = vez;
					vitoria = checkWinner(this.jogador);
					this.setIcon(iconXizinho);
					System.out.println(this.jogador);
					vez = jogador_2;
					jLabel.setText("Jogador: "+Integer.toString(vez));
					this.click = true;
					if (vitoria) {
						JOptionPane.showMessageDialog(null,"Vit�ria do jogador "+Integer.toString(jogador));
						for(int i = 0; i < 9; i++) {
							botoes.get(i).setIcon(null);
							botoes.get(i).id = 0;
							botoes.get(i).jogador = 100;
							botoes.get(i).click = false;
						}
						vitoria = false;
					}
				}else if(vez == jogador_2) {
					this.jogador = vez;
					vitoria = checkWinner(this.jogador);
					this.setIcon(iconBolinha);
					System.out.println(this.jogador);
					vez = jogador_1;
					jLabel.setText("Jogador: "+Integer.toString(vez));
					this.click = true;
					if (vitoria) {
						JOptionPane.showMessageDialog(null,"Vit�ria do jogador "+ Integer.toString(jogador));
						for(int i = 0; i < 9; i++) {
							botoes.get(i).setIcon(null);
							botoes.get(i).id = 0;
							botoes.get(i).jogador = 100;
							botoes.get(i).click = false;
						}
						vitoria = false;
					}
				}
			}
		}
	}
}
