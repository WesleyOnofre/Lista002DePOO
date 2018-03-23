import java.util.Scanner;

public class Q_012 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a diagonal maior: ");
		double a = leitor.nextDouble();
		
		System.out.print("Digite a diagonal menor: ");
		double b = leitor.nextDouble();
		
		System.out.println("Área do losango:" + ( a * b ) / 2);
		
		
	}

}
