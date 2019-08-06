
public class Punto {
    private double x,y;
    public double ConsultaX(){
        return x;
    }
    public double ConsultaY(){
        return y;
    }
    public void Desplazar(double dx, double dy) {
        x = dx;
        y = dy;
    }
    public Punto(){
        x = 0;
        y = 0;
    }
    public Punto(double x1, double y1){
        x = x1;
        y = y1;
    }
    public String Cadena(double sx, double sy){
        String cadena="";
        cadena = "(" + x + "," + y + ")";
        return cadena;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    public double distancia(Punto otroPunto){
        return Math.sqrt(Math.pow(ConsultaX() - otroPunto.ConsultaX(),2) + Math.pow(ConsultaY() - otroPunto.ConsultaY(),2) );
    }
    public double distanciaACero(){
        Punto origen = new Punto();
        return origen.distancia(this);
    }
    public boolean equals(Punto p1){
        return this.x == p1.x && this.y == p1.y;
    }
}