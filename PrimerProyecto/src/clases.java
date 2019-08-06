import java.util.Scanner;

public class clases {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		System.out.print("Ingrese un valor ");
		numero = input.nextInt();
		
		if (esPrimo(numero)) {
			System.out.println("El número ingresado es Primo");
		} else {
			System.out.println("El número ingresado no es Primo");
		}
	}

	static boolean esPrimo(int num) {
		boolean flag = false;
		for (int i = 2; i <= num ; i++) {
			int j;
			for (j = i/2; j >= 1 && i%j !=0; j--) {
			}
				if (j == 1) {
					flag = true;
				} else {
					flag = false;
				}
					
		}
		return flag;
	}
}
