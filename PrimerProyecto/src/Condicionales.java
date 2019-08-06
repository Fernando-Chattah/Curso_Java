import java.util.Scanner;
public class Condicionales {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese un Valor: ");
		double dividendo = input.nextDouble();
		System.out.println("Ingrese el divisor ");
		double divisor = input.nextDouble();
		if (divisor != 0) {
			System.out.println("El resultado es: " + (dividendo / divisor));
		} else {
			System.out.print("No se puede dividir por cero");
		}
	}
}
