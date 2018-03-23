import java.util.Scanner;

public class Q_007 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Salário: ");
		double a = leitor.nextDouble();
		
		System.out.print("Valor de suas vendas: ");
		double b = leitor.nextDouble();
		
		double comissao = b * 0.04;
		
		System.out.println("Seu salário final é: " + (a + comissao));
		
	}

}
