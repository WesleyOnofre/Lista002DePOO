import java.util.Scanner;

public class Q_006 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu sal�rio: ");
		double a = leitor.nextDouble();
		
		if (a < 500) {
			System.out.println("Seu sal�rio com reajuste �:" + (a + (a * 0.3)));
		}else {
			System.out.println("N�o ter� reajuste");
		}
		
		leitor.close();
		
	}

}
