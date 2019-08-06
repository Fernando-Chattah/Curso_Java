import java.util.Scanner;

public class ClicloFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = 0;
		int aux = 0;
		System.out.print("Ingrese un valor ");
		numero = input.nextInt();
		
		for (int i = 1; i <= numero/2; i++) {
			int resultado = 0;
			resultado = numero % i;
			
			if (resultado == 0) {
				if (aux < i){
					aux = i;
				}
			}
		}
		System.out.println("El mayor divisor de " + numero + " es : " + aux);
	}
}
