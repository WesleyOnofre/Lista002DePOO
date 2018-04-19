import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Q_010 {

	public static void main(String []args){
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite à altura:");
		double h = leitor.nextDouble();
		
		String[] options = {"Femenino", "Masculino"};
        ImageIcon icon = new ImageIcon("src/images/turtle32.png");
        String n = (String)JOptionPane.showInputDialog(null, "Qual seu sexo?", 
                "POO", JOptionPane.QUESTION_MESSAGE, icon, options, null);
        System.out.println(n);
		
		
		leitor.close();
	}
	
}
