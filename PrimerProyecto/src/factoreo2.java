import java.util.Scanner;

public class factoreo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		System.out.print("Ingrese un valor ");
		numero = input.nextInt();
		factorizar(numero);
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

	static int menorDivisorPrimo (int numero) {
		int divisor;
		for (divisor = 2; !(esPrimo(divisor) && esDivisor(divisor, numero));divisor++) {}
		return divisor;
	}

	static boolean esDivisor(int divisor, int numero) {
		return numero % divisor == 0;
	}
	
	static void factorizar(int numero) {
		while (numero != 1) {
			int factor = menorDivisorPrimo(numero);
			System.out.print(factor + "*");
			numero = numero / factor;
		}
		System.out.println("1");
	}
	
}
