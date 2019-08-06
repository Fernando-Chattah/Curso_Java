
	public class Punto {
		private double x; 
		private double y;
		public void desplazar(double lat, double lon) {
			this.x += lat;
			this.y += lon;
		}
		
		public Punto(double valIniX, double valIniY) {
			x = valIniX;
			y = valIniY;
		}
		
		public Punto() {
			x = 0;
			y = 0;
		}
		
		public double x() {
			return x;
		}
		
		public double y() {
			return y;
		}
		
		public String toString() {
			return "[" + x + ", " + y + "]"; 
		}
		
		public double calcularDistancia (Punto otroPunto) {
			return Math.sqrt(
					Math.pow((otroPunto.x() - this.x()),2)
				  + Math.pow((otroPunto.y() - this.y()),2)
				  );
		}
		
		public double calcularAlcero () {
			Punto origen = new Punto();
			return this.calcularDistancia(origen);
		}
		
		public boolean equals (Punto p) {
			return (this.x() == p.x) && (this.y() == p.y); 
		}
	}
	