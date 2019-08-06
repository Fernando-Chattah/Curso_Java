import java.util.Scanner;

	public class Cuenta {
		protected double saldo = 0;
	
		public Cuenta(double saldoInicial) {
			saldo = saldoInicial;
		}
		
		public void depositar(double monto) {
			saldo += monto;
		}

		public boolean extraer(double monto) {
			boolean realizado;
			if (monto <= saldo) {
				saldo -= monto;
				realizado = true;
			} else {
				realizado = false;
			}
			return realizado;
		}

		protected boolean puedeExtraer(double suma) {
			return (saldo >= suma);
		}
		
		public boolean extraer(double monto, boolean puedoExtraer) {
			boolean realizado;
			if (puedoExtraer) {
				this.extraer(monto);
				realizado = true;
			} else {
				realizado = false;
			}
			return realizado;
		}	
		
	public double consultarSaldo() {
		return saldo;
	}
	
	public boolean transferirSaldo(double monto, Cuenta cuentaDestino) {
		boolean pudeExtraer = extraer(monto);
		if (pudeExtraer) {
			cuentaDestino.depositar(monto);
		}
		return pudeExtraer;
	}
}
