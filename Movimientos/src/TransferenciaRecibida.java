
public class TransferenciaRecibida extends Transferencia{
	protected String destino;
	
	public TransferenciaRecibida (double monto, int plazo, int frecuencia, String destino) {
		super(monto, plazo, frecuencia);
		this.destino = destino;
	}
	
	public String destino() {
		return destino;
	}
	
	public boolean credito() {
		return true;
	}
}