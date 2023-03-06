package Lista_02;

public class Principal {

	public static void main(String[] args) {
		
        Endereco end = new Endereco(5980500,"RN","Lucrécia");
        
	//	Empresa e = new Empresa("Salgaditos", 214,end);
		
		Restaurante r = new Restaurante("ViaMassa",849652354,end,"Salgadinhos",22.50);
		
	//	e.imprime();
		System.out.println("--------------------------------------");
		r.imprime();
		System.out.println("--------------------------------------");
		
	}

}
