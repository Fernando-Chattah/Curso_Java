import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = 0;
		int resultado = 0;
		do {
			System.out.println("Ingrese un valor");
			numero = input.nextInt();
			resultado = numero + resultado;
		}
		while (numero != 0);
		System.out.println("El resultado es " + resultado);
	}
}

