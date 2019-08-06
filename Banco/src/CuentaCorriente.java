
public class CuentaCorriente extends Cuenta {
	private double descubierto;
	
	public CuentaCorriente(double saldoInicial, double descubierto) {
		super(saldoInicial);
		this.descubierto = descubierto;
	}
	
	public boolean extraer(double suma) {
		if (saldo + descubierto > suma) {
			saldo -= suma;
			return true;
		} else {
			return false;
		}
	}
}
