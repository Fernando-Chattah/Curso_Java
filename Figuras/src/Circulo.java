
public class Circulo extends Figura {
//atributos internos
	private Punto centro;
	private double radio;

//constructores	
	public Circulo(Punto centro1, double radio) {
		this.centro = centro1;
		this.radio = radio;
	}
	
//metodos publicos
	public Punto dameCentro() {
		return this.centro;
	}
	
	public double dameRadio() {
		return this.radio;
	}
	
	public double area() {
		return Math.PI * radio * radio;
	}
	
	public boolean enArea(Punto unPunto) {
		return centro.distancia(unPunto) <= radio;
	}
}