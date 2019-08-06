
public class Recta {
	private Punto puntoDePaso;
	private double pendiente;
	
	public Recta(Punto unPunto, double unDouble) {
		pendiente = unDouble;
		puntoDePaso = unPunto;
	}
	
	public String toString() {
		return puntoDePaso.toString() + " " + pendiente;
	}
	
	public boolean esPunto(Punto unPunto) {
		return (((unPunto.x() - puntoDePaso.x()) * pendiente) == (unPunto.y() - puntoDePaso.y()));
	}
	
	public boolean esPunto(double x, double y) {
		puntoDePaso unPunto = new puntoDePaso;
	}
}

