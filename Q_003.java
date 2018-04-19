import java.util.Scanner;

public class Q_003 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número:");
		double a = leitor.nextDouble();
		
		System.out.print("Digite um número:");
		double b = leitor.nextDouble();
		
		boolean x = a > b;
		boolean z = b > a;
		
		if (x == true){
			System.out.print("O número " + a +" é maior, e o menor é  " + b );
		}else if(z == true) {
			System.out.print("O número " + b +" é maior, e o menor é  " + a );
		}
		
		leitor.close();
		
	}

}
