import java.util.Scanner;

public class Q_009 {
	
	public static void main(String []args){
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o valor de um produto: ");
		double a = leitor.nextDouble();
		
		double b = a + (a * 0.05);
		double c = a + (a * 0.10);
		double d = a + (a * 0.15);
		
		if (a <= 50){
			System.out.println("Preço do novo produto: " + b);
			if(b <= 80){
				System.out.println("Barato");
			}
		}else if(a > 50 && a <= 100){
			System.out.println("Preço do novo produto: " + c);
			if(c > 80 && c <= 120){
				System.out.println("Normal");
			}else if(c <= 80){
				System.out.println("Barato");
			}
		}else if(a > 100){
			System.out.println("Preço do novo produto: " + d);
			if(d > 80 && d <= 120){
				System.out.println("Normal");
			}else if(d <= 80){
				System.out.println("Barato");
			}else if(d > 120 && d <= 200){
				System.out.println("Caro");
			}else if(d > 200){
				System.out.println("Muito caro");
			}
		}
		
		leitor.close();
	}
}
