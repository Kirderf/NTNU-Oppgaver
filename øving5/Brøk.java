package øving5;

public class Brøk {
	private double nevner;
	private double teller;
	public double brøk;
	
	public Brøk(double teller, double nevner) {
		  if (nevner == 0) {
			    throw new IllegalArgumentException("Nevner kan ikke være null");
		  }
		  this.nevner = nevner;
		  this.teller = teller;
		  this.brøk = teller/nevner;
	}
	public Brøk(double teller) {
		this.nevner = 1;
		this.teller = teller;
		this.brøk = teller/nevner;
	}
	
	public static double calcSum(double brøk1, double brøk2) {
		return brøk1 + brøk2;
	}
	public static double calcSub(double brøk1, double brøk2) {
		return brøk1 - brøk2;
	}
	public static double calcMulti(double brøk1, double brøk2) {
		return brøk1*brøk2;
	}
	public static double calcDel(double brøk1, double brøk2) {
		return brøk1/brøk2;
	}
	
	


}
