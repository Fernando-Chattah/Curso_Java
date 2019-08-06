import java.util.Scanner;

public class Suma2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = 0;
		int resultado = 0;
		do {
			System.out.print("Ingrese un valor ");
			numero = input.nextInt();
			if (numero < 0){
				resultado++;
			}
		}
		while (numero != 0);
		System.out.println("La cantidad de datos mayores a ceros son: " + resultado);
	}

}
