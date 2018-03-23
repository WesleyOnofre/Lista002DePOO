import java.util.Scanner;

public class Q_014 {
	
	public static void main(String[] ars){
		
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.print("Digite um valor: ");
	int a = leitor.nextInt();
	
	int tentativas = 10;
	
	while(tentativas > 0){
		tentativas--;
		System.out.println(a);
		a++;
	}
	
	System.out.println("Agora a tabuada");
	
	tentativas = 10;
	int b = 1;
	int c = (a - 10);
	
		for(a = 0; tentativas > 0  ; b++ ) {
			tentativas--;
			System.out.println(c * b);
		}
	
	}
}
