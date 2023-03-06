package Primeiro;

public class ContaCorrente extends Conta{
    private float limite; 
    	
    
    public ContaCorrente(int num, float saldo, Pessoa dono, float limite) {
		super(num, saldo, dono);
		this.limite = limite;
	}
    public ContaCorrente() {
  		super();
  		this.limite = 200;
  	}
    
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	@Override
    public void imprime() {
    	//System.out.println("Número da conta:\n"+getNum()+"\nSaldo:"+getSaldo()+"\nDados do dono:\n"+getDono());
		super.imprime(); // para nao repetir código
    	System.out.println("Essa é uma conta do tipo CC e tem o limite de: \n"+this.limite);
	}

}
