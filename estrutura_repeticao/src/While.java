import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma=0;
		
		while(true) {
			int number = sc.nextInt();
			if(number == 0) {
				break;
			}
			else {
				soma += number;
			}
		}
		System.out.println("A soma é " + soma);
		sc.close();
	}

	
}
