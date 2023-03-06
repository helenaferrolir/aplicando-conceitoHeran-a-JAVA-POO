package Lista_02;

public class Restaurante extends Empresa{
	
    private String tipoComida;
    private double valorComida;

	public Restaurante() {
		super();
		tipoComida = "--";
		valorComida = 0;
	}

	public Restaurante(String nome, int telefone, Endereco endereco, String tipoComida, double valorComida) {
		super(nome, telefone, endereco);
		this.tipoComida = tipoComida;
		this.valorComida = valorComida;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	public double getValorComida() {
		return valorComida;
	}

	public void setValorComida(double valorComida) {
		this.valorComida = valorComida;
	}
	public void imprime() {
		super.imprime(); // para nao repetir código
    	System.out.println("\nTipo de comida: "+this.tipoComida+"\nValor do prato: "+this.valorComida);
	}

}
