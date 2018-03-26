import java.util.Scanner;

public class Q_019 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Diginte a temperatura em Celsius: ");
		double a = leitor.nextDouble();
		
		System.out.println("Valor em Fahrenheit: " + ( (a * 9/5) + 32) );
		
		
	}

}
