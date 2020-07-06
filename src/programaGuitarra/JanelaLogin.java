package programaGuitarra;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JanelaLogin extends JFrame implements ActionListener{
	private static final int largura = 400;
	private static final int altura = 200;
	
	private JLabel lblUser;
	private JLabel lblPass;
	private JTextField txtUser;
	private JPasswordField txtPass;
	private JButton btnSave;
	private JButton btnCancel;
	private ArrayList<String> listUsers;
//	private ArrayList<String> listPass;
	
	public JanelaLogin() {
		this.setLayout(null);
		
		this.lblUser = new JLabel();
		this.lblUser.setText("Usuário:");
		this.lblUser.setBounds(40, 30, 50, 10);
		this.add(this.lblUser);
		
		this.txtUser = new JTextField(30);
		this.txtUser.setBounds(110, 20, 250, 30);
		this.txtUser.setEditable(true);
		this.add(this.txtUser);
		
		this.lblPass = new JLabel();
		this.lblPass.setText("Senha:");
		this.lblPass.setBounds(40, 70, 50, 10);
		this.add(this.lblPass);
		
		this.txtPass = new JPasswordField();
		this.txtPass.setBounds(110, 60, 250, 30);
		this.txtUser.setEditable(true);
		this.add(this.txtPass);
				
		this.btnSave = new JButton();
		this.btnSave.setText("Salvar");
		this.btnSave.setBounds(290, 100, 70, 30);
		this.btnSave.addActionListener(this);
		this.add(this.btnSave);
		
		this.btnCancel = new JButton();
		this.btnCancel.setText("Cancelar");
		this.btnCancel.setBounds(190, 100, 90, 30);
		this.btnCancel.addActionListener(this);
		this.add(this.btnCancel);
		
		this.setTitle("Login");
		this.setSize(largura, altura);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == this.btnCancel) {
			this.clickBtnCancel();
		}
		if(event.getSource() == this.btnSave){
			this.clickBtnSave();
		}	
	}	
	
	@SuppressWarnings("deprecation")
	private void clickBtnSave() {
		LerArquivoLogin lerArquivoLogin = new LerArquivoLogin();
		String user = this.txtUser.getText();
		String pass = this.txtPass.getText();
		
		this.listUsers = lerArquivoLogin.getDados();
		int teste = 0; 

			for(int i = 0; i<(this.listUsers.size()-1); i++) {
//				System.out.println(this.listUsers.get(i) + " "+ i);
				if(user.equals(this.listUsers.get(i))) {
					if(pass.equals(this.listUsers.get(i+1))) {
						JOptionPane.showMessageDialog(null, "Login correto!");
						JanelaPrincipal janelaPrincipal = new JanelaPrincipal();	
						this.dispose();
						teste = teste + 1;
					}else {
						JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");					
						this.txtUser.setText("");
						this.txtPass.setText("");
					}
					break;
				}
			}	
			if(teste != 1 ) {
				JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
				this.txtUser.setText("");
				this.txtPass.setText("");
			}	
		//JOptionPane.showMessageDialog(null, "Apertei bot�o salvar");		
	}	
	private void clickBtnCancel() {
		System.exit(0);
		//JOptionPane.showMessageDialog(null, "Apertei bot�o cancelar");
	}	
//	public void setListUsers(ArrayList<String> listUsers) {
//		this.listUsers = listUsers;
//	}
//	
//	public void setListPass(ArrayList<String> listPass) {
//		this.listPass = listPass;
//	}
}
