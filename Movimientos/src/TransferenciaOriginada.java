
public class TransferenciaOriginada extends Transferencia {
	protected String origen;
	
	public TransferenciaOriginada (double monto, int plazo, int frecuencia, String origen) {
		super(monto, plazo, frecuencia);
		this.origen = origen;
	}
	
	public String origen() {
		return origen;
	}
	
	public boolean credito() {
		return false;
	}
}