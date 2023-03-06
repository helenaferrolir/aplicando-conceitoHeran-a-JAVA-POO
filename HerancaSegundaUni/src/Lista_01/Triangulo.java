package Lista_01;

public class Triangulo extends Poligono{
        
	
	public Triangulo() {
		super();
		
	}

	public Triangulo(double altura, double base) {
		super(altura, base);
	}
	
	public double areaTriangulo (double base, double altura) {
		
		double area = (base * altura)/2;
		
		return area;
	}
}
