package Primeiro;

public class Pessoa {
    private String nome;
    private int id;
    
	public Pessoa() {
		nome = "----";	
		id = 0;
		}
	public Pessoa(String nome, int id) {
		this.nome = nome;	
		this.id = id;
		}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() { //pega o dado do objeto
		return id;
	}
	public void setId(int id) { //alterar a informação do objeto 
		this.id = id;
	}
	
	@Override// expressa que o método esta sendo sobescrito, sobrepondo um método que já existe na class objet
	         // toda class java herda da classe objet
	public String toString() {
		return "Pessoa [nome=" + nome + ", id=" + id + "]";
	}
	
}
