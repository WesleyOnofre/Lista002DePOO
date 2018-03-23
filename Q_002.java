import java.util.Scanner;

public class Q_002 {

	public static void main(String[] args){
	
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o número de a:");
		Double a = leitor.nextDouble();
		
		System.out.print("Digite o número de b:");
		Double b = leitor.nextDouble();
		
		System.out.print("Digite o número de c:");
		Double c = leitor.nextDouble();
		
		Double S = (a - b - c);
		// subtração dos três números 
		
		Double s = (a + b + c);
		// soma dos três
		
		Double M = (a * b * c);
		
		System.out.println("A subtração destes três números é: " + S);
		
		System.out.println("A soma dos três números é: " + s);
		
		System.out.println("A multiplicação dos três números é: " + M);
		
		leitor.close(); 
		
	}
	
}
