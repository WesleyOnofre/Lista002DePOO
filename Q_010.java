import java.util.Scanner;

public class Q_010 {

	public static void main(String []args){
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite à altura:");
		double h = leitor.nextDouble();
		
		System.out.println("1 - Masculino"
				+ " 2 - Feminino");
		int opções = leitor.nextInt();
		
		if(opções == 1) {
			System.out.println((72.7*h)-58);
		}else if(opções == 2) {
			System.out.println((62.1*h)-44.7);
		}
		
		leitor.close();
	}
	
}
