import java.util.Scanner;

public class Q_011 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite o valor do lado do quadrado:");
		double ladodoquadrado = leitor.nextDouble();

		System.out.print("A área do quadrado é: " + (Math.pow(ladodoquadrado, 2)));
		
	}

}
