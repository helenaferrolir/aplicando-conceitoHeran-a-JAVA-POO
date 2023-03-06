package Lista_04;

public class Caminhao extends Veiculo {

	private double toneladas;
	private double alturaMAX;
	private double comprimento;
	
	public Caminhao() {
		super();
		toneladas = 0;
		alturaMAX = 0;
		comprimento = 0;
		
	}
	public Caminhao(double peso, int velocidadeMAX, double preco, Pessoa dono, 
			         double toneladas, double alturaMAX, double comprimento) {
		super(peso,velocidadeMAX,preco,dono);
		this.toneladas = toneladas;
		this.alturaMAX = alturaMAX;
		this.comprimento = comprimento;
		
	}

	public double getToneladas() {
		return toneladas;
	}

	public void setToneladas(double toneladas) {
		this.toneladas = toneladas;
	}

	public double getAlturaMAX() {
		return alturaMAX;
	}

	public void setAlturaMAX(double alturaMAX) {
		this.alturaMAX = alturaMAX;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public void imprimeCaminhao() {
		super.imprimeVeiculo();
		System.out.println("CAMINHAO \n Altura máxima: "+this.alturaMAX+"Comprimento: "
		+this.comprimento+"Toneladas: "+this.toneladas);
	}

}
