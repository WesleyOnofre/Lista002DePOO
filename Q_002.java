import java.util.Scanner;

public class Q_002 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite sua nota:");
		double a = leitor.nextDouble();
		
		System.out.print("Digite sua nota:");
		double b = leitor.nextDouble();
		
		double md = (a + b) / 2;
		
		if(md >= 7) {
			System.out.print("Aprovado");
		}else if(md >= 4 && md < 7) {
			System.out.print("Recuperação");
		}else {
			System.out.print("Reprovado");
		}
		
		leitor.close();
	}

}
