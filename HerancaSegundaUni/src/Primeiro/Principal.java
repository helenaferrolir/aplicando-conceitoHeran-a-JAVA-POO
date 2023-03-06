package Primeiro;

public class Principal {


	public static void main(String[] args) {
     
       Pessoa p1 = new Pessoa("Helena", 123);
       //Conta c = new Conta(123, 100, p1);	
       ContaCorrente cc = new ContaCorrente(123, 1000, p1, 800);
       cc.imprime();

       System.out.println("--------------");
       
       //Pessoa p2 = new Pessoa("Nayara",321);
       
       ContaPoupanca cp = new ContaPoupanca(124,2000, new Pessoa("Nayara",321),10);
       
       cp.imprime();

	}

}
