import java.util.Scanner;

public class Q_005 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		double a = leitor.nextDouble();
		
		System.out.print("Nota 2: ");
		double b = leitor.nextDouble();
		
		System.out.println("Sua média " + (a * 2 + b * 3) / 5 );
		
	}

}