import java.util.Scanner;

public class Q_004 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um n�mero:");
		double a = leitor.nextDouble();
		
		System.out.print("Digite um n�mero:");
		double b = leitor.nextDouble();
		
		System.out.print("Digite um n�mero:");
		double c = leitor.nextDouble();
		
		boolean x = a > b && a > c ;
		boolean y = b > a && b > c ;
		boolean z = c > a && c > b;
		// o maior n�mero ^^^^^^^^^//
		boolean l = a < b && a < c ;
		boolean m = b < a && b < c ;
		boolean n = c < a && c < b;
		// o menor n�mero ^^^^^^^^^//
		
		
		
		if (x == true && n == true){
			System.out.print("O MAIOR n�mero � " + a +", e o MENOR � " + c );
		}else if(x == true && m == true) {
			System.out.print("O MAIOR n�mero � " + a +", e o MENOR � " + b );
		}else if(y == true && l == true) {
			System.out.print("O MAIOR n�mero � " + b +", e o MENOR � " + a );
		}else if(y == true && n == true) {
			System.out.print("O MAIOR n�mero � " + b +", e o MENOR � " + c );
		}else if(z == true && l == true) {
			System.out.print("O MAIOR n�mero � " + c +", e o MENOR � " + a );
		}else if(z == true && m == true) {
			System.out.print("O MAIOR n�mero � " + c +", e o MENOR � " + b );
		}else if(x == y == z == l == m == n) {
			System.out.print("T� bagun�ando!! VOLTE TUDO DE NOVO!");
		}
		
		leitor.close();
		
	}

}
