package programaGuitarra;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class JanelaPrincipal extends JFrame implements ChangeListener, ActionListener{
	private static final int largura = 500;
	private static final int altura = 400;
	private JTabbedPane jTabbedAbas;
	private JPanel jPanelBlack;
	private JPanel jPanelWhite;
	private JPanel painelCadastrarGuitarra;
	private JScrollPane jScrollPane;
	private JPanel jPanelTop;
	private JPanel jPanelBottom;
	// ---- aula -----
//	private JButton btnOk;
//	private JButton btnClear;
//	private JComboBox<String> jComboBoxEstados;
//	private JTextArea jTextArea;
//	private ButtonGroup buttonGroup;
//	private JRadioButton radioMasc;
//	private JRadioButton radioFem;
//	private JCheckBox checkProfissao;
	//----- cadastro novo user ------
	private JLabel lblNome;
	private JLabel lblSenha;
	private JLabel lblConfirmaSenha;
	private JTextField txtNome;
	private JTextField txtSenha;
	private JTextField txtConfirmaSenha;
	private JButton btnConfirmaUsuario;
	private JButton btnLimpaUsuario;
	
	private ArrayList<String> dadosValidaCadastro;
	private ArrayList<String> dadosCadastro;
	//----- consulta guitarra -----
	private JTextArea txtConsulta;
	
	private JScrollPane scroll;
	
	private JRadioButton rdbSerial;
	private JRadioButton rdbEstoque;
	
	private ButtonGroup group;
	
	private JLabel lblSerial;
	private JLabel lblPrice;
	private JLabel lblBuilder;
	private JLabel lblModel;
	private JLabel lblType;
	private JLabel lblInSerial;
	
	private JTextField txtSerial;
	private JTextField txtPrice;
	private JTextField txtBuilder;
	private JTextField txtModel;
	private JTextField txtType;
	private JTextField txtInSerial;
	
	private JButton btnConsultar;
	private JButton btnLimparConsulta;
	private JButton btnCadastrarGuitarra;
	
	private ArrayList<String> dadosGuitarra;	
	private ArrayList<String> dadosValidaGuitarra;
	public JanelaPrincipal() {
		
		this.setLayout(new BorderLayout());		
		this.jTabbedAbas = new JTabbedPane();
		this.jTabbedAbas.addChangeListener(this);

		this.add(BorderLayout.CENTER, this.jTabbedAbas);
		
		this.jPanelBlack = new JPanel();
		this.jPanelBlack.setLayout(null);
		/// ----------- Cad User   -----------
		this.lblNome = new JLabel();
		this.lblNome.setText("Usu�rio:");
		this.lblNome.setBounds(80, 30, 50, 10);
		this.jPanelBlack.add(this.lblNome);
		
		this.txtNome = new JTextField(30);
		this.txtNome.setBounds(150, 20, 250, 30);
		this.txtNome.setEditable(true);
		this.jPanelBlack.add(this.txtNome);
		
		this.lblSenha = new JLabel();
		this.lblSenha.setText("Senha:");
		this.lblSenha.setBounds(90, 70, 50, 10);
		this.jPanelBlack.add(this.lblSenha);
		
		this.txtSenha = new JPasswordField();
		this.txtSenha.setBounds(150, 60, 250, 30);
		this.txtSenha.setEditable(true);
		this.jPanelBlack.add(this.txtSenha);
		
		this.lblConfirmaSenha = new JLabel();
		this.lblConfirmaSenha.setText("Confirme sua Senha:");
		this.lblConfirmaSenha.setBounds(10, 110, 120, 10);
		this.jPanelBlack.add(this.lblConfirmaSenha);
		
		this.txtConfirmaSenha = new JPasswordField();
		this.txtConfirmaSenha.setBounds(150, 100, 250, 30);
		this.txtConfirmaSenha.setEditable(true);
		this.jPanelBlack.add(this.txtConfirmaSenha);
				
		this.btnConfirmaUsuario = new JButton();
		this.btnConfirmaUsuario.setText("Salvar");
		this.btnConfirmaUsuario.setBounds(330, 140, 70, 30);
		this.btnConfirmaUsuario.addActionListener(this);
		this.jPanelBlack.add(this.btnConfirmaUsuario);
		
		this.btnLimpaUsuario = new JButton();
		this.btnLimpaUsuario.setText("Limpar");
		this.btnLimpaUsuario.setBounds(230, 140, 90, 30);
		this.btnLimpaUsuario.addActionListener(this);
		this.jPanelBlack.add(this.btnLimpaUsuario);

		/// ----------- Config de aula   -----------
		
//		this.jComboBoxEstados = new JComboBox<String>();
//		this.jComboBoxEstados.addItem("AM");
//		this.jComboBoxEstados.addItem("ES");
//		this.jComboBoxEstados.addItem("MG");
//		this.jComboBoxEstados.addItem("SP");
//		this.jComboBoxEstados.setBounds(200, 100, 80, 25);
//		this.jPanelBlack.add(jComboBoxEstados);
//		this.jComboBoxEstados.addActionListener(this);
//		
//		this.buttonGroup = new ButtonGroup();
//		this.radioMasc = new JRadioButton();
//		this.radioMasc.setText("Masculino");
//		this.radioMasc.setBounds(50, 50, 90, 30);
//		this.buttonGroup.add(radioMasc);
//		this.jPanelBlack.add(this.radioMasc);
//		
//		this.radioFem = new JRadioButton();
//		this.radioFem.setText("Feminino");
//		this.radioFem.setBounds(140, 50, 90, 30);
//		this.buttonGroup.add(radioFem);
//		this.jPanelBlack.add(this.radioFem);
//		
//		this.checkProfissao = new JCheckBox();
//		this.checkProfissao.setText("Estudante");
//		this.checkProfissao.setBounds(200, 50, 90, 30);
//		this.jPanelBlack.add(this.checkProfissao);
		
		this.jPanelBlack.setBackground(Color.black);
		this.jTabbedAbas.addTab("Preto",this.jPanelBlack);
		

		//--------------Tela de consulta de guitarra (aba 2)-------------------------------------
		this.jPanelWhite = new JPanel();
		this.jPanelWhite.setLayout(new GridLayout(2, 1));
		
		//Painel de cima
		this.jPanelTop = new JPanel();
		this.jPanelTop.setLayout(null);
		this.jPanelTop.setBackground(Color.black);
		this.rdbSerial = new JRadioButton();
		this.rdbSerial.setText("Serial");
		this.rdbSerial.setBackground(Color.black);
		this.rdbSerial.setForeground(Color.white);
		this.rdbSerial.setBounds(30, 20, 90, 20);
		this.jPanelTop.add(rdbSerial);
		
		this.rdbEstoque = new JRadioButton();
		this.rdbEstoque.setText("Estoque");
		this.rdbEstoque.setBackground(Color.black);
		this.rdbEstoque.setForeground(Color.white);
		this.rdbEstoque.setBounds(120, 20, 90, 20);
		this.jPanelTop.add(rdbEstoque);
	
		this.rdbEstoque.addActionListener(this);
		this.rdbSerial.addActionListener(this);
		
		this.group = new ButtonGroup();
		this.group.add(this.rdbEstoque);
		this.group.add(this.rdbSerial);
		
		this.lblInSerial = new JLabel();
		this.lblInSerial.setText("N�mero de S�rie: ");
		this.lblInSerial.setForeground(Color.white);
		this.lblInSerial.setBounds(30, 60, 130, 30);
		
		this.txtInSerial = new JTextField();
		this.txtInSerial.setBounds(140, 65, 160, 20);
		this.txtInSerial.setEditable(true);
		this.jPanelTop.add(txtInSerial);
		
		this.btnConsultar = new JButton();
		this.btnConsultar.setText("Consultar");
		this.btnConsultar.setBounds(30, 110, 100, 30);
		this.btnConsultar.addActionListener(this);
		this.jPanelTop.add(btnConsultar);
		
		this.btnLimparConsulta = new JButton();
		this.btnLimparConsulta.setText("Limpar Consulta");
		this.btnLimparConsulta.setBounds(150, 110, 150, 30);
		this.btnLimparConsulta.addActionListener(this);
		this.jPanelTop.add(btnLimparConsulta);
		
		this.jPanelTop.add(lblInSerial);
		this.jPanelWhite.add(jPanelTop);
		
		//Painel de Baixo
		
		this.jPanelBottom = new JPanel();
		this.jPanelBottom.setLayout(new BorderLayout());
		
		this.txtConsulta = new JTextArea();
		this.txtConsulta.setEditable(false);
		this.scroll = new JScrollPane(this.txtConsulta);
		this.jPanelBottom.add(this.scroll, BorderLayout.CENTER);
		this.jPanelBottom.setBackground(Color.white);
		this.jPanelWhite.add(this.jPanelBottom);
		
		this.jPanelWhite.setBackground(Color.BLACK);
		this.jTabbedAbas.addTab("Consulta de Guitarras", this.jPanelWhite);
		
		
		/// ----------- Config de aula   -----------
//		this.btnOk = new JButton();
//		this.btnOk.setText("Ok");
//		this.btnOk.setBounds(10, 10, 80, 30);
//		this.btnOk.addActionListener(this);
//		this.jPanelTop.add(this.btnOk);	
//		
//		this.btnClear = new JButton();
//		this.btnClear.setText("Limpar");
//		this.btnClear.setBounds(100, 10, 80, 30);
//		this.btnClear.addActionListener(this);
//		this.jPanelTop.add(this.btnClear);
//		this.jPanelTop.setBackground(Color.blue);
//		this.jPanelWhite.add(this.jPanelTop);
//
//		this.jPanelBottom = new JPanel();
//		this.jPanelBottom.setLayout(new BorderLayout());
//		this.jPanelWhite.add(this.jPanelBottom);
//		this.jTextArea = new JTextArea();
//		this.jScrollPane = new JScrollPane(this.jTextArea);
//		this.jPanelBottom.setBackground(Color.red);
//		this.jPanelBottom.add(this.jScrollPane, BorderLayout.CENTER);		
		// ---- Aba de cadastro de guitarra -----
		
		this.painelCadastrarGuitarra = new JPanel();
		this.painelCadastrarGuitarra.setLayout(null);
		this.painelCadastrarGuitarra.setBackground(Color.black);
		this.jTabbedAbas.addTab("Cadastro de Guitarra", this.painelCadastrarGuitarra);
		
		this.lblSerial = new JLabel();
		this.lblSerial.setText("N�mero de S�rie: ");
		this.lblSerial.setForeground(Color.white);
		this.lblSerial.setBounds(30, 30, 130, 30);
		this.painelCadastrarGuitarra.add(lblSerial);
		
		this.lblPrice = new JLabel();
		this.lblPrice.setText("Pre�o: ");
		this.lblPrice.setForeground(Color.white);
		this.lblPrice.setBounds(30, 70, 70, 30);
		this.painelCadastrarGuitarra.add(lblPrice);
		
		this.lblBuilder = new JLabel();
		this.lblBuilder.setText("Fabricante: ");
		this.lblBuilder.setForeground(Color.white);
		this.lblBuilder.setBounds(30, 110, 80, 30);
		this.painelCadastrarGuitarra.add(lblBuilder);
		
		this.lblModel = new JLabel();
		this.lblModel.setText("Modelo: ");
		this.lblModel.setForeground(Color.white);
		this.lblModel.setBounds(30, 150, 70, 30);
		this.painelCadastrarGuitarra.add(lblModel);
		
		this.lblType = new JLabel();
		this.lblType.setText("Tipo: ");
		this.lblType.setForeground(Color.white);
		this.lblType.setBounds(30, 190, 60, 30);
		this.painelCadastrarGuitarra.add(lblType);
		
		this.txtSerial = new JTextField();
		this.txtSerial.setBounds(155, 35, 200, 20);
		this.txtSerial.setEditable(true);
		this.painelCadastrarGuitarra.add(txtSerial);
		
		this.txtPrice = new JTextField();
		this.txtPrice.setBounds(155, 75, 200, 20);
		this.txtPrice.setEditable(true);
		this.painelCadastrarGuitarra.add(txtPrice);
		
		this.txtBuilder = new JTextField();
		this.txtBuilder.setBounds(155, 115, 200, 20);
		this.txtBuilder.setEditable(true);
		this.painelCadastrarGuitarra.add(txtBuilder);
		
		this.txtModel = new JTextField();
		this.txtModel.setBounds(155, 155, 200, 20);
		this.txtModel.setEditable(true);
		this.painelCadastrarGuitarra.add(txtModel);
		
		this.txtType = new JTextField();
		this.txtType.setBounds(155, 195, 200, 20);
		this.txtType.setEditable(true);
		this.painelCadastrarGuitarra.add(txtType);
		
		this.btnCadastrarGuitarra = new JButton();
		this.btnCadastrarGuitarra.setText("Cadastrar");
		this.btnCadastrarGuitarra.setBounds(30, 235, 150, 30);
		this.btnCadastrarGuitarra.addActionListener(this);
		this.painelCadastrarGuitarra.add(btnCadastrarGuitarra);
		
		this.setTitle("Principal");
		this.setSize(largura, altura);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	@Override
	public void stateChanged(ChangeEvent event) {
		int aba = 0;
		String nomeAba = "";
		
//		if(event.getSource() == this.jTabbedAbas) {
//			aba = this.jTabbedAbas.getSelectedIndex();
//			nomeAba = this.jTabbedAbas.getTitleAt(aba);
//			System.out.println(nomeAba);
//		}
	
	}
	@Override
	public void actionPerformed(ActionEvent event) {
//		if(event.getSource() == this.jComboBoxEstados) {
//			System.out.println(this.jComboBoxEstados.getSelectedItem());			
//		}
//		if(event.getSource() == this.btnOk) {
//			this.jTextArea.setText(this.jTextArea.getText()+"Hey hey hey hey hey hey\n");
//		}
//		if(event.getSource() == this.btnClear) {
//			this.jTextArea.setText("");
//		}
		if(event.getSource() == this.btnConfirmaUsuario) {
			this.clickBtnCadastrarUsuario();
		}
		if(event.getSource() == this.btnLimpaUsuario){
			this.clickBtnLimpaUsuario();
		}
		if(event.getSource() == this.btnConsultar) {
			if(rdbEstoque.isSelected() == true) {
				this.clickBtnConsultaEstoque();
			}
			else if(rdbSerial.isSelected() == true) {
				this.clickBtnConsultaSerial();
			}
			else {
				JOptionPane.showMessageDialog(null, "Selecionie 'Serial' ou 'Estroque' antes de consultar!");
			}
		}
		
		if (event.getSource() == this.btnCadastrarGuitarra) {
			this.clickBtnCadastrarGuitarra();
		}
	}
	
	private void clickBtnLimpaUsuario() {
		this.txtNome.setText("");
		this.txtSenha.setText("");
	}
	
	private void clickBtnCadastrarUsuario() {

		String usuario = "";
		String senha = "";
		String confirmaSenha = "";
		usuario = this.txtNome.getText();
		senha = this.txtSenha.getText();
		confirmaSenha = this.txtConfirmaSenha.getText();
		if(senha.equals(confirmaSenha)) {
			LerArquivoLogin lerArquivoLogin = new LerArquivoLogin();
			lerArquivoLogin.lerLogin();
			this.dadosValidaCadastro = lerArquivoLogin.getDados();
			this.dadosCadastro = new ArrayList<String>();
			int temp = 0;
			
			for (int i=0; i <= (dadosValidaCadastro.size()-1); i++) {
				if(usuario.equals(this.dadosValidaCadastro.get(i))) {
					JOptionPane.showMessageDialog(null, "Nome de usu�rio j� utilizado!");
					this.txtNome.setText("");
					this.txtSenha.setText("");
					temp += 1;
					break;
				}
			}		
			if (temp == 0) {
				dadosCadastro.add(usuario);
				dadosCadastro.add(senha);
				CriarLogin criarLogin = new CriarLogin(dadosCadastro);
				criarLogin.gravarArquivos();
				this.txtNome.setText("");
				this.txtSenha.setText("");
				this.txtConfirmaSenha.setText("");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Senhas divergentes.");
			this.txtSenha.setText("");
			this.txtConfirmaSenha.setText("");
		}
	}
	
	private void clickBtnConsultaSerial() {
		LerArquivoGuitarra lerArquivoGuitarra = new LerArquivoGuitarra();
		lerArquivoGuitarra.lerGuitarra();		
		this.dadosGuitarra = lerArquivoGuitarra.getDados();
		
		String serial = "";
		serial = "#" + this.txtInSerial.getText();
		int temp = 0;
		for(int i = 0;i <= (dadosGuitarra.size() - 1); i++) {
			if(serial.equals(this.dadosGuitarra.get(i))) {
				int aux = i;
				for (int j = aux; j <= aux + 4; j++) {
					this.txtConsulta.setText(this.txtConsulta.getText() + dadosGuitarra.get(j) + "\n");	
					temp += 1;
				}							
			}	
		}
		if(temp == 0) {
			JOptionPane.showMessageDialog(null, "Este n�mero de s�rie n�o est� cadastrado!");
		}
		this.txtInSerial.setText("");
	}
	
	private void clickBtnConsultaEstoque() {
		LerArquivoGuitarra lerArquivoGuitarra = new LerArquivoGuitarra();
		lerArquivoGuitarra.lerGuitarra();		
		this.dadosGuitarra = lerArquivoGuitarra.getDados();	
		for(int i = 0;i <= (dadosGuitarra.size() - 1); i++) {
			if(dadosGuitarra.get(i) == null) {
				break;
			}
			else {
				this.txtConsulta.setText(this.txtConsulta.getText() + dadosGuitarra.get(i) + "\n");
			}
		}	
	}
	
	private void clickBtnCadastrarGuitarra() {
		this.dadosGuitarra = new ArrayList<String>();
		LerArquivoGuitarra lerArquivoGuitarra = new LerArquivoGuitarra();
		lerArquivoGuitarra.lerGuitarra();
		this.dadosValidaGuitarra = lerArquivoGuitarra.getDados();
		String serial = "";
		String price = "";
		String builder = "";
		String model = "";
		String type = "";
		
		serial = this.txtSerial.getText();
		price = this.txtPrice.getText();
		builder = this.txtBuilder.getText();
		model = this.txtModel.getText();
		type = this.txtType.getText();
		int temp = 0;
		
		if(!serial.matches("[0-9]*") || !price.matches("[0-9]*") ) {
			JOptionPane.showMessageDialog(null, "Digite apenas números no campo Número de Serie e Preço!");
			this.txtSerial.setText("");
			this.txtPrice.setText("");
			serial = this.txtSerial.getText();
		}
		else {
			for (int i=0; i <= (dadosValidaGuitarra.size()-1); i++) {
				if(("#"+serial).equals(this.dadosValidaGuitarra.get(i))) {
					JOptionPane.showMessageDialog(null, "Esse número de série ja foi utilizado!");
					this.txtSerial.setText("");
					this.txtPrice.setText("");
					this.txtBuilder.setText("");
					this.txtModel.setText("");
					this.txtType.setText("");
					temp += 1;
					break;
				}
			}
			
			if (temp == 0) {
				dadosGuitarra.add("#"+serial);
				dadosGuitarra.add("R$"+price);
				dadosGuitarra.add(builder);
				dadosGuitarra.add(model);
				dadosGuitarra.add(type+"\n");
				CadastrarGuitarra cadastrarGuitarra = new CadastrarGuitarra(dadosGuitarra);
				cadastrarGuitarra.gravarArquivos();
							
				this.txtSerial.setText("");
				this.txtPrice.setText("");
				this.txtBuilder.setText("");
				this.txtModel.setText("");
				this.txtType.setText("");
			}
		}
	}
}
