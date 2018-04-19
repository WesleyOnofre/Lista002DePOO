import java.util.Scanner;

public class Q_001 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite sua nota:");
		double a = leitor.nextDouble();
		
		System.out.print("Digite sua nota:");
		double b = leitor.nextDouble();
		
		System.out.print("Digite sua nota:");
		double c = leitor.nextDouble();
		
		System.out.print("Digite sua nota:");
		double d = leitor.nextDouble();
		
		double md = (a + b + c + d) / 4;
		
		if (md >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		leitor.close();
		
	}

}
