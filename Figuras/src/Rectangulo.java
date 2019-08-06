
public class Rectangulo extends Figura{
	Punto inf, sup;
	
	public Rectangulo(Punto inf, Punto sup) {
		this.inf = inf;
		this.sup = sup;
	}
	
	public void dameSup() {
		this.sup = sup;
	}
	
	public boolean enArea(Punto unPunto) {
		return (inf.ConsultaX() <= unPunto.ConsultaX())
			&& (unPunto.ConsultaX() <= unPunto.ConsultaX())
			&& (inf.ConsultaY() <= unPunto.ConsultaY())
			&& (unPunto.ConsultaY() <= sup.ConsultaY());
	}
}