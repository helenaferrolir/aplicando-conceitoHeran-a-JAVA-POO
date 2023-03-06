package Lista_04;

public class CarroPasseio extends Veiculo {
	
       private String modelo;
       private String cor;
       
	public CarroPasseio() {
		super();
		modelo = "--";
		cor = "--";
	}
	public CarroPasseio(double peso, int velocidadeMAX, double preco, Pessoa dono, String modelo, String cor) {
		super(peso,velocidadeMAX,preco,dono);
		this.modelo = modelo;
		this.cor = cor;
	}
	

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
    public void imprimeCarroPasseio () {
    	super.imprimeVeiculo();
    	System.out.println("CARRO PASSEIO \n"
    			+ " MODELO: "+this.modelo+" COR: "+this.cor);
    	
    }
}
