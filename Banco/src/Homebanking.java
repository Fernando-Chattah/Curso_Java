import java.util.Scanner;

public class Homebanking {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cuenta miCuenta = new Cuenta(0);
		Cuenta otraCuenta = new Cuenta(0);
		
		int nroOperacion = 0;
		double importe = 0;
		while (nroOperacion != 5) {
			System.out.print("Ingrese la acción: ");
			System.out.println("1) Consultar Saldo - 2) Depositar - 3) Extraer - 4) Transferir");
			nroOperacion = input.nextInt();

			switch (nroOperacion) {
				case 1: 
						System.out.println(miCuenta.consultarSaldo());
						break;
				case 2: {
						System.out.println("Ingrese el monto a Depositar");
						importe = input.nextDouble();
						miCuenta.depositar(importe); 
						break;
				}
				case 3: 
						System.out.println("Ingrese el monto a Extraer");
						importe = input.nextDouble();
						if (!miCuenta.extraer(importe)) {
							System.out.println("No posee saldo para extraer");
						};
				case 4: 
					System.out.println("Ingrese el monto a Transferir");
					importe = input.nextDouble();
					miCuenta.transferirSaldo(importe, otraCuenta);
					System.out.println("El saldo de la cuenta Origen es " + miCuenta.consultarSaldo());
					System.out.println("El saldo de la cuenta Destino es " + otraCuenta.consultarSaldo());
					System.out.println("");
			}
		}
	}
}