import java.util.Scanner;

public class Q_003 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um n�mero:");
		double a = leitor.nextDouble();
		
		System.out.print("Digite um n�mero:");
		double b = leitor.nextDouble();
		
		boolean x = a > b;
		boolean z = b > a;
		
		if (x == true){
			System.out.print("O n�mero " + a +" � maior, e o menor �  " + b );
		}else if(z == true) {
			System.out.print("O n�mero " + b +" � maior, e o menor �  " + a );
		}
		
		leitor.close();
		
	}

}
