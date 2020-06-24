package aluno;
import javax.swing.JOptionPane;

public class main {
	public main() {
		aluno aluno = new aluno(12);
		//aluno.setRegistroAcademico(12);
		JOptionPane.showMessageDialog(null, aluno.getRegistroAcademico());
	}
	
	public static void main(String[] args) {
		main main = new main();
	}
}
