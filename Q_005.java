import java.util.Scanner;

import javax.swing.JOptionPane;

public class Q_005 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		double a = leitor.nextDouble();
		
		System.out.print("Digite um valor: ");
		double b = leitor.nextDouble();
		
		leitor.close();
		
		String desenha =  "1 - M�dia entre os dois n�meros \n"
                + "2 - Diferen�a do maior pelo menor \n"
                + "3 - Produto entre os n�meros digitados\n"
                + "4 - Divis�o do primeiro pelo segundo\n"
                + "5 - O primeiro n�mero elevado ao segundo\n"
                + "6 - Raiz quadrada de cada um dos n�meros\n"
                + "7 - Raiz cubica de cada um dos n�meros\n";
		int escolheu = Integer.parseInt(JOptionPane.showInputDialog(desenha));
		
		if (escolheu == 1) {
			System.out.println((a + b) / 2);
		}else if(escolheu ==2) {
			if (a > b) {
				System.out.println(a -b);
			}else if(b > a) {
				System.out.println(b -a);
			}
		}else if(escolheu == 3){
			System.out.println(a * b);
		}else if(escolheu == 4) {
			System.out.println(a /b);
		}else if(escolheu == 5) {
			System.out.println(Math.pow(a, b));
		}else if(escolheu == 6) {
			System.out.println(Math.sqrt(a));
			System.out.println(Math.sqrt(b));
		}else if(escolheu == 7) {
			System.out.println(Math.cbrt(a));
			System.out.println(Math.cbrt(b));
		}
	}
	
}
