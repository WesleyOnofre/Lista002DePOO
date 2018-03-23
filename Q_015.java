import java.util.Scanner;

public class Q_015 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o ano de seu nascimento: ");
		int AnoDeNascimento = leitor.nextInt();
		
		System.out.print("Digite o ano atual: ");
		int AnoAtual = leitor.nextInt();
		
		int AnosDoIndivido = (AnoAtual - AnoDeNascimento);
		
		System.out.println("Anos aproximadamete: " + AnosDoIndivido);
		
		System.out.println("Em meses: " + (AnosDoIndivido * 12) );
		
		System.out.println("Em dias: " + (AnosDoIndivido * 365));
		
		System.out.println("Em horas aproximadamente: "+ (AnosDoIndivido * 52.1429 ));

	}

}
