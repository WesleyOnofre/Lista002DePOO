import java.util.Scanner;

public class Q_009 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		double a = leitor.nextDouble();		
		
		double PesoEmGramas = a * 1000 ;
		
		System.out.print("Seu peso em gramas:" + PesoEmGramas );
		
	}

}