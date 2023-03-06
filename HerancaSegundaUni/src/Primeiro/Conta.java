package Primeiro;

public class Conta {
    private int num;
    private float saldo;
    private Pessoa dono;
    
	public Conta() {
		this.num = 0;
		this.saldo = 0;
		this.dono = new Pessoa();
	}
	
	public Conta(int num, float saldo, Pessoa dono) {
		this.num = num;
		this.saldo = saldo;
		this.dono = dono;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}
	
    public void imprime() {
		System.out.println("Número da conta:\n"+this.num+"\nSaldo:"+saldo+"\nDados do dono:\n"+this.dono);
	}

	
	
}
