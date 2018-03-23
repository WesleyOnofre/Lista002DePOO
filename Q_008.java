import java.util.Scanner;

public class Q_008 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		double peso = leitor.nextDouble();
		
		double np =  peso * 0.15;
		
		double novopeso = peso * 0.20;
		
		System.out.println("Supondo que engordou:" + ( np + peso ) );
		
		System.out.println("Supondo que imagreceu:" + ( peso - np ));
		
	}
}