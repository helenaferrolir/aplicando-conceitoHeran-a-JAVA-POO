package Lista_01;

public class Poligono {
    private double base; 
    private double altura;
    
	public Poligono() {
		base = 0;
		altura = 0;
	}
	public Poligono(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	public double getComprimento() {
		return base;
	}
	public void setComprimento(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
