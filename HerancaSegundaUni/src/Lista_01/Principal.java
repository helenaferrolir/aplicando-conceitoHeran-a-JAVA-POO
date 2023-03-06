package Lista_01;

public class Principal {

	public static void main(String[] args) {
		
		//Poligono p = new Poligono(10,5);
		
		Triangulo t = new Triangulo();
		
		Retangulo r = new Retangulo();
   
		System.out.println("A área do retangulo é: \n"+r.areaRetangulo(5, 10));
		System.out.println("--------------------------");
		System.out.println("A área do triangulo é: \n"+t.areaTriangulo(6, 12));

	}

}
