
import javax.swing.JOptionPane;

public class NumeroParImpar {

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: "));
		
		if(num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O número "+ num + " é par.");
		}else {
			JOptionPane.showMessageDialog(null, "O número "+ num + " é impar.");
		}
		
		
	}

}
