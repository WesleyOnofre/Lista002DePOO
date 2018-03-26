import java.util.Scanner;

public class Q_020 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a dimensão do cômodo: ");
		double a = leitor.nextDouble();
		
		System.out.print("Digite a dimensão do cômodo: ");
		double b = leitor.nextDouble();
		
		double area = a * b;
		
		System.out.println("Área: " + area+"m²" );
		System.out.println(("Potência: " + (a * b) / 18 ));
		
		
	}

}
