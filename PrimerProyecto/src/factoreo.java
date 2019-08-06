import java.util.Scanner;

public class factoreo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		System.out.print("Ingrese un valor ");
		numero = input.nextInt();
		
		System.out.println("El factor de " + numero + " es ");
		factor(numero);
	}

	static void factor(int num) {
		int res=0;
		for (int i = 1; res != 1 ; i++) {
			for (int j = 2; res != 1 ; j++) {
				if (num%j==0) {
					System.out.println(j);;
					res=num/j;
					num=res;
					break;
				}			
			}
		}
	}
}