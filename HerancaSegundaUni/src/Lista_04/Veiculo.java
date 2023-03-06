package Lista_04;

public class Veiculo {
	
    private double peso;
    private int velocidadeMAX;
    private double preco;
    private Pessoa dono;
    
	public Veiculo() {
		peso = 0;
		velocidadeMAX= 0;
		preco = 0;
		dono = new Pessoa();
	}
	public Veiculo(double peso, int velocidadeMAX, double preco, Pessoa dono) {
		this.peso = peso;
		this.velocidadeMAX= velocidadeMAX;
		this.preco = preco;
		this.dono = new Pessoa(dono.getNome(),dono.getRg());
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getVelocidadeMAX() {
		return velocidadeMAX;
	}

	public void setVelocidadeMAX(int velocidadeMAX) {
		this.velocidadeMAX = velocidadeMAX;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	public void imprimeVeiculo() {
		System.out.println("Veiculo [Peso= " + this.peso + ", Velocidade Máxima= "
	+ this.velocidadeMAX + ", Preço= " + this.preco + ", Dono= " + this.dono); 
	}
	
	

}
