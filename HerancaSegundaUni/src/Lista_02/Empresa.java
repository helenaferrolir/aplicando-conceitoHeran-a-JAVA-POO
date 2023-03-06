package Lista_02;

public class Empresa {
     private Endereco endereco;
     private String nome;	
	 private int telefone;
     
	public Empresa() {
     nome = "--";
     telefone = 0;
     endereco = new Endereco();
	}
	public Empresa(String nome, int telefone, Endereco endereco) {
	     this.nome = nome;
	     this.telefone = telefone;
	     this.endereco = new Endereco(endereco.getCep(),endereco.getEstado(),endereco.getCidade()); 
		}
    
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public void imprime() {
		
		System.out.println("Nome: "+ this.nome +" Telefone: "+this.telefone+"\n"+this.endereco);
	}

}
