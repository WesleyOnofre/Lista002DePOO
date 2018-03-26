import java.util.Scanner;

public class Q_023 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro ângulo: ");
		int a = leitor.nextInt();
		
		System.out.println("Digite o valor do segundo ângulo: ");
		int b = leitor.nextInt();
		
		int md = 180  - (a + b);

		System.out.print("Faltam: " + md);		

	}

}
