import java.util.Scanner;

public class Q_016 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite o salário de João: ");
		double a = leitor.nextInt();
		
		System.out.print("Valor da primeira conta: ");
		double b = leitor.nextDouble();
		
		System.out.print("Valor da segunda conta: ");
		double c = leitor.nextDouble();
		
		double rs = a - ((b + c) + (b * 0.02) + (c * 0.02));
		
		System.out.println(rs);
		
		
	}

}
