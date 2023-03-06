package Lista_01;

public class Retangulo extends Poligono {
     
	public Retangulo() {
	 super();
	}
	
	public Retangulo(double altura, double base) {
		 super(base, altura);
		 
		}
	
    public double areaRetangulo (double base, double altura) {
		
		double area = base * altura;
		
		return area;
	}
}
