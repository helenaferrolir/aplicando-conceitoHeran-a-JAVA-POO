package Lista_03;

public class Pessoa {
    private String nome;
    private int idade;
    
	public Pessoa() {
		nome = "--";
		idade = 0;
	}
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void imprime() {
		System.out.println("Nome= " + this.nome + ", idade= " + this.idade);
	}

}
