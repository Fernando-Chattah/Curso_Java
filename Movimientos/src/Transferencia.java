import java.time.LocalDateTime;

public abstract class Transferencia extends Movimiento implements Recurrente {
	protected int plazo;
	protected boolean confirmado = false;
	public int frecuencia;
	
// Constructores de la clase
	public Transferencia(double monto, int plazo, int frecuencia) {
		super(monto);
		this.plazo = plazo;
		this.frecuencia = frecuencia;
	}
	
	public void confirmar() {
		if (this.fecha.plusDays(plazo).compareTo(LocalDateTime.now()) <= 0)
			confirmado = true;
	}
	
	public boolean confirmado() {
		return confirmado;
	}
	
	public int periodicidad() {
		return frecuencia;
	}
	
	public LocalDateTime proxima() {
		return fecha.plusDays(frecuencia);
	}
}