import java.awt.Color;

public class Figura {
// atributos privados de figuras    
	private Color color;
	private boolean relleno;
	
// metodos publicos de figuras
	public void pintar(Color color) {
		this.color = color;
	}
	
	public void rellenar (boolean relleno) {
		this.relleno = relleno;
	}
}
