package Lista_03;

public class Politico extends Pessoa {
    private String partido;
    
	public Politico() {
		super();
		partido = "--";
	}
	public Politico(String nome, int idade, String partido) {
		super(nome, idade);
		this.partido = partido;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}
	
	public void imprimePolitico() {
		super.imprime();
		System.out.println("Partido= "+this.partido);
	}

}
