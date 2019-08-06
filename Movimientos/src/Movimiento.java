import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public abstract class Movimiento {

// Atributos
	protected LocalDateTime fecha;
	protected double monto;
	public abstract boolean credito(); 

// Constructores de la clase	

	public Movimiento(double monto) {
		this.monto = monto;
		fecha = LocalDateTime.now();
	}
	
// Constructores de los atributos
	
	public LocalDate dameFecha() {
		return fecha.toLocalDate().now();
	}
	
	public LocalTime dameHora() {
		return fecha.toLocalTime().now();
	}
	
	public double dameMonto() {
		return this.monto;
	}
	
	public boolean debito() {
		return !credito();
	}
}