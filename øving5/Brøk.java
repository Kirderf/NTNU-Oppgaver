package �ving5;

public class Br�k {
	private double nevner;
	private double teller;
	public double br�k;
	
	public Br�k(double teller, double nevner) {
		  if (nevner == 0) {
			    throw new IllegalArgumentException("Nevner kan ikke v�re null");
		  }
		  this.nevner = nevner;
		  this.teller = teller;
		  this.br�k = teller/nevner;
	}
	public Br�k(double teller) {
		this.nevner = 1;
		this.teller = teller;
		this.br�k = teller/nevner;
	}
	
	public static double calcSum(double br�k1, double br�k2) {
		return br�k1 + br�k2;
	}
	public static double calcSub(double br�k1, double br�k2) {
		return br�k1 - br�k2;
	}
	public static double calcMulti(double br�k1, double br�k2) {
		return br�k1*br�k2;
	}
	public static double calcDel(double br�k1, double br�k2) {
		return br�k1/br�k2;
	}
	
	


}
