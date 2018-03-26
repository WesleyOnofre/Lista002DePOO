import java.util.Scanner;

public class Q_021 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite à quantidade de horas trabalhadas: ");
		double horas = leitor.nextDouble();
		
		System.out.print("Valor do salário minímo: ");
		double sm = leitor.nextDouble();
		
		System.out.print("Horas extras: ");
		double he = leitor.nextDouble();
		
		double ht = (0.125 * sm) * horas;
		// valor da hora trabalhada
		
		double horasextras = (0.25 * sm) * he;
		// valor da hora extra
		
		System.out.println("Salário-base:" + ht);
		
		System.out.println("Adicional: " + horasextras);
		
	}

}
