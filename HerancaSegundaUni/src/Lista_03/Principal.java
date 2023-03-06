package Lista_03;

public class Principal {


	public static void main(String[] args) {
		Prefeito p = new Prefeito("Mariana",33,"PDT");
		Governador g = new Governador("Fátima",54,"PT");
		
		p.imprimePolitico();
		g.imprimePolitico();
	}

}
