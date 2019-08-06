
public class Puntos {

	public static void main(String[] args) {
		Punto p = new Punto();
		Punto otroPunto = new Punto();
		Recta recta = new Recta(otroPunto, 2);
		
		System.out.println(p.equals(otroPunto));
		System.out.println(p.x());
		System.out.println(p.y());
		p.desplazar(1,2.5);
		System.out.println(p.x());
		System.out.println(p.y());
		System.out.println(p);
		otroPunto.desplazar(2, 5);
		System.out.println(p.calcularDistancia(otroPunto));
		System.out.println(otroPunto.calcularAlcero());
		System.out.println(p.equals(otroPunto));

		if (recta.esPunto(otroPunto)) {
			System.out.println("Es un punto de paso");
		} else {
			System.out.println("No es un punto de paso");
		};
		
		System.out.println(recta.toString());
	}
}