package øving5oppgave1;

public class BrøkRegning {
	private static double nevner;
	private static double teller;
	public static double resultat;
	private static double brøkC1;
	private static double brøkC2;
	
	public BrøkRegning(double teller, double nevner) {
		  if (nevner == 0) {
			    throw new IllegalArgumentException("nevner må være positiv");
		  }
		  this.nevner = nevner;
		  this.teller = teller;
		  this.brøkC1 = teller/nevner;
	}
	public BrøkRegning(double teller) {
		this.nevner = 1;
		this.teller = teller;
		this.brøkC2 = teller/nevner;
	}
	
	
	
	public static void main(String[] args) {
		
		
	BrøkRegning Brøk1 = new BrøkRegning(9,3);
	BrøkRegning Brøk2 = new BrøkRegning(2);
	
	getSum(Brøk1.brøkC1,Brøk2.brøkC2);
	System.out.println(resultat);
	getSub(Brøk1.brøkC1,Brøk2.brøkC2);
	System.out.println(resultat);
	getMulti(Brøk1.brøkC1,Brøk2.brøkC2);
	System.out.println(resultat);
	getDel(Brøk1.brøkC1,Brøk2.brøkC2);
	System.out.println(resultat);
	
	}
	
	
	
	public static void getSum(double brøk1, double brøk2) {
		resultat = brøk1 + brøk2;
	}
	public static void getSub(double brøk1, double brøk2) {
		resultat = brøk1 - brøk2;
	}
	public static void getMulti(double brøk1, double brøk2) {
		resultat = brøk1*brøk2;
	}
	public static void getDel(double brøk1, double brøk2) {
		resultat = brøk1/brøk2;
	}
}
