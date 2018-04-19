import java.util.Scanner;

public class Q_004 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número:");
		double a = leitor.nextDouble();
		
		System.out.print("Digite um número:");
		double b = leitor.nextDouble();
		
		System.out.print("Digite um número:");
		double c = leitor.nextDouble();
		
		boolean x = a > b && a > c ;
		boolean y = b > a && b > c ;
		boolean z = c > a && c > b;
		// o maior número ^^^^^^^^^//
		boolean l = a < b && a < c ;
		boolean m = b < a && b < c ;
		boolean n = c < a && c < b;
		// o menor número ^^^^^^^^^//
		
		
		
		if (x == true && n == true){
			System.out.print("O MAIOR número é " + a +", e o MENOR é " + c );
		}else if(x == true && m == true) {
			System.out.print("O MAIOR número é " + a +", e o MENOR é " + b );
		}else if(y == true && l == true) {
			System.out.print("O MAIOR número é " + b +", e o MENOR é " + a );
		}else if(y == true && n == true) {
			System.out.print("O MAIOR número é " + b +", e o MENOR é " + c );
		}else if(z == true && l == true) {
			System.out.print("O MAIOR número é " + c +", e o MENOR é " + a );
		}else if(z == true && m == true) {
			System.out.print("O MAIOR número é " + c +", e o MENOR é " + b );
		}else if(x == y == z == l == m == n) {
			System.out.print("Tá bagunçando!! VOLTE TUDO DE NOVO!");
		}
		
		leitor.close();
		
	}

}
