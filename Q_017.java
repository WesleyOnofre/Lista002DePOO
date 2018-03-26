import java.util.Scanner;

public class Q_017 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o valor do cateto a: ");
		double a = leitor.nextDouble();
		
		System.out.print("Digite o valor do cateto b: ");
		double b = leitor.nextDouble();
		
		double h = Math.pow(a, 2) + Math.pow(b, 2);
		
		System.out.println("Valor da Hipotenusa: " + (Math.sqrt(h)));
		
		leitor.close();
		
	}

}
