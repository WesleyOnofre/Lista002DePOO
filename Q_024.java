import java.util.Scanner;

public class Q_024 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("Valor em horas: ");
		int horas = leitor.nextInt();
		
		System.out.println("Valor em minutos: ");
		int minutos = leitor.nextInt();
		
		int cm = horas * 60;
		
		System.out.println("Horas convertidas em minutos: " + cm);
		System.out.println("Total de minutos: " + (minutos + cm) );
		System.out.println("Total de minutos convertidos em segundos: " + ((horas * 60) + minutos) * 60 );
		
	}

}
