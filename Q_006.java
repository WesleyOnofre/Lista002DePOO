import java.util.Scanner;

public class Q_006 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Produto: ");
		double a = leitor.nextDouble();
		
		double desconto = a * 0.10 ;
		
		System.out.println("Novo preço do produto: " + (a - desconto));
		
	}

}
