import java.util.Scanner;

public class Q_006 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu salário: ");
		double a = leitor.nextDouble();
		
		if (a < 500) {
			System.out.println("Seu salário com reajuste é:" + (a + (a * 0.3)));
		}else {
			System.out.println("Não terá reajuste");
		}
		
		leitor.close();
		
	}

}
