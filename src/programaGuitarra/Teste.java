package programaGuitarra;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout.Group;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Teste extends JFrame{
	private static final int largura = 500;
	private static final int altura = 500;
	private JLabel jLabel;
	private JButton jButton;
	private JTextField jTextField;
	private JRadioButton jRadioButtonMasc;
	private JRadioButton jRadioButtonFem;
	private ButtonGroup buttonGroup;
		
	public Teste() {
		this.setLayout(new FlowLayout());
	
		this.jLabel = new JLabel();
		this.jLabel.setText("Primeiro label");
		this.jLabel.setToolTipText("Dica");
		this.add(this.jLabel);
		
		this.jButton = new JButton();
		this.jButton.setText("OK");
		this.jButton.setToolTipText("Dica botão");
		this.add(this.jButton);
		
		this.jTextField = new JTextField(30);
		this.add(this.jTextField);
		
		this.jRadioButtonMasc = new JRadioButton();
		this.jRadioButtonMasc.setText("Masculino");
		this.add(jRadioButtonMasc);
		
		this.jRadioButtonFem = new JRadioButton();
		this.jRadioButtonFem.setText("Feminino");
		this.add(jRadioButtonFem);
		
		this.buttonGroup = new ButtonGroup();
		this.buttonGroup.add(jRadioButtonMasc);
		this.buttonGroup.add(jRadioButtonFem);
		
		this.setTitle("Primeira janela");
		this.setSize(largura, altura);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}