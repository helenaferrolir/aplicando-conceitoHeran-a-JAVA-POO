package Lista_04;

public class Principal {


	public static void main(String[] args) {
		
     Pessoa p = new Pessoa("Helena",003436275);
     Pessoa n = new Pessoa("Nay",0034354);
     
     CarroPasseio cp = new CarroPasseio(100,80,70000,p,"Mercerdes","Preto");
     
    Caminhao cm = new Caminhao(4000,50,954750,n,8547,74,87); 
     
     
     cp.imprimeCarroPasseio();
     cm.imprimeCaminhao();
     
	}

}
