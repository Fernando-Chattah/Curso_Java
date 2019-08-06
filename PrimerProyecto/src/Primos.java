import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = 0;
		System.out.print("Ingrese un valor ");
		numero = input.nextInt();
		
		for (int i = 2; i <= numero ; i++) {
			int j;
			for (j = i/2; j >= 1 && i%j !=0; j--) {}
				if (j == 1) {
					System.out.println(i);
				}
			}
		}
	}