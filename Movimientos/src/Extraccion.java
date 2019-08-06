
public class Extraccion extends Movimiento {
// Constructor de la clase = modelado del objeto
	public Extraccion(double monto) {
		super(monto);
	}
		
	public boolean confirmado() {
		return true;
	}
	
	public boolean credito() {
		return false;
	}
}