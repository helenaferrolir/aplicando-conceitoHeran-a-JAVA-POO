package Lista_02;

public class Endereco {
    private int cep;
    private String estado;
    private String cidade;
    
    public Endereco(){
		cep = 0;
		estado = "--";
		cidade = "--";
	}
	public Endereco(int cep, String estado, String cidade) {
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String toString() {
		return "Endereco: [CEP = " + this.cep + ", Estado = " + this.estado + ", Cidade = " + this.cidade + "]";
	}

    public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	

	
}
