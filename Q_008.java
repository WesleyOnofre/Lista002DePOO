import java.util.Scanner;

public class Q_008 {
	
	public static void main(String []args){
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o seu saldo médio: ");
		double a = leitor.nextDouble();
		
		if(a > 400){
			System.out.println("Saldo médio: " + a + " Valor do crédito " + (a * 0.30) );
		}else if(a <= 400 && a >300 ){
			System.out.println("Saldo médio: " + a + " Valor do crédito " + (a * 0.25) );
		}else if(a <= 300 && a > 200){
			System.out.println("Saldo médio: " + a + " Valor do crédito " + (a * 0.20) );
		}else if(a <= 200){
			System.out.println("Saldo médio: " + a + " Valor do crédito " + (a * 0.10) );
		}
		
		leitor.close();
	}

}
