import java.util.Scanner;

public class Q_022 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a quantidades de lado: ");
		int a = leitor.nextInt();
		
		System.out.println("Números de diagonais: " +  a * (a - 3) / 2);
		

	}

}
