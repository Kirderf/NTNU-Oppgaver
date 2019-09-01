package �ving5oppgave1;

public class Br�kRegning {
	private static double nevner;
	private static double teller;
	public static double resultat;
	private static double br�kC1;
	private static double br�kC2;
	
	public Br�kRegning(double teller, double nevner) {
		  if (nevner == 0) {
			    throw new IllegalArgumentException("nevner m� v�re positiv");
		  }
		  this.nevner = nevner;
		  this.teller = teller;
		  this.br�kC1 = teller/nevner;
	}
	public Br�kRegning(double teller) {
		this.nevner = 1;
		this.teller = teller;
		this.br�kC2 = teller/nevner;
	}
	
	
	
	public static void main(String[] args) {
		
		
	Br�kRegning Br�k1 = new Br�kRegning(9,3);
	Br�kRegning Br�k2 = new Br�kRegning(2);
	
	getSum(Br�k1.br�kC1,Br�k2.br�kC2);
	System.out.println(resultat);
	getSub(Br�k1.br�kC1,Br�k2.br�kC2);
	System.out.println(resultat);
	getMulti(Br�k1.br�kC1,Br�k2.br�kC2);
	System.out.println(resultat);
	getDel(Br�k1.br�kC1,Br�k2.br�kC2);
	System.out.println(resultat);
	
	}
	
	
	
	public static void getSum(double br�k1, double br�k2) {
		resultat = br�k1 + br�k2;
	}
	public static void getSub(double br�k1, double br�k2) {
		resultat = br�k1 - br�k2;
	}
	public static void getMulti(double br�k1, double br�k2) {
		resultat = br�k1*br�k2;
	}
	public static void getDel(double br�k1, double br�k2) {
		resultat = br�k1/br�k2;
	}
}
