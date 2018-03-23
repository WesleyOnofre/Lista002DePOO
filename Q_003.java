import java.util.Scanner;

public class Q_003 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double a = leitor.nextInt();
		
		System.out.println("Digite um número: ");
		double b = leitor.nextInt();
		
		int D = (int) ( a / b );
		//divisão 
		int r = (int) ( a % b );
		// resto da divisão
		double f = ( a / b );
		
		System.out.println("Divisão destes números: " + D);
		System.out.println("Resto da divisão: " + r);
		System.out.println("Divisão real deste número" + f);
		
		leitor.close();
	}

}
