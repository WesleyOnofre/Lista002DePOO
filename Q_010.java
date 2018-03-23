import java.util.Scanner;

public class Q_010 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o trapezio maior: ");
		double a = leitor.nextDouble();
		
		System.out.print("Digite o trapezio menor: ");
		double b = leitor.nextDouble();
		
		System.out.print("Digite a altura: ");
		double altura = leitor.nextDouble();
		
		double area = (( a + b ) * altura) / 2 ;

		System.out.print("Área do trapezio igual à: " + area);
		
	}

}
