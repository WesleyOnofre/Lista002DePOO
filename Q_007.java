import java.util.Scanner;

public class Q_007 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o seu sal�rio: ");
		double a = leitor.nextDouble();
		
		if(a <= 300) {
			System.out.print("Sal�rio com reajuste " + (a + (a * 0.35)));
		}else if(a > 300){
			System.out.print("Sal�rio com reajuste " + (a + (a * 0.15)));
		}
		
		leitor.close();
		
	}

}