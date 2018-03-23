import java.util.Scanner;

public class Q_013 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o valor do salário minimo: ");
		double a = leitor.nextDouble();
		
		System.out.print("Digite seu salário: ");
		double b = leitor.nextDouble();
		
		System.out.println("Você recebe cerca de " + (int) ( b / a ) + " Salarios minimos");
		
	}

}
