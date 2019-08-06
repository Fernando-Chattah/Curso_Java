
public class Deposito extends Movimiento{
	
// Constructor de la clase
	public Deposito(double monto) {
		super(monto);
	}
	
	public boolean confirmado() {
		return true;
	}
	public boolean credito() {
		return true;
	}
}