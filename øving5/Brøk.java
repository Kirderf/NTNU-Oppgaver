package �ving5;

public class Br�k {
	private double nevner;
	private double teller;
	private double resultat;
	
	public Br�k(double teller, double nevner) {
		  if (nevner == 0) {
			    throw new IllegalArgumentException("Nevner kan ikke v�re null");
		  }
		  this.nevner = nevner;
		  this.teller = teller;
		  this.resultat = teller/nevner;
	}
	public Br�k(double teller) {
		this.nevner = 1;
		this.teller = teller;
		this.resultat = teller/nevner;
	}
	
	public void calcSum(Br�k br�k2) {
		this.teller = (this.teller*br�k2.getNevner())+(br�k2.getTeller()*this.nevner);
		this.nevner = (this.nevner*br�k2.getNevner());
		this.resultat = (this.teller/this.nevner);
						
	}
	public void calcSub(Br�k br�k2) {
		this.teller = (this.teller*br�k2.getNevner())-(br�k2.getTeller()*this.nevner);
		this.nevner = (this.nevner*br�k2.getNevner());
		this.resultat = (this.teller/this.nevner);
	}
	public void calcMulti(Br�k br�k2) {
		this.teller = this.teller*br�k2.getTeller();
		this.nevner = this.nevner*br�k2.getNevner();
		this.resultat =  this.teller/this.nevner;
	}
	public void calcDel(Br�k br�k2) {
		this.teller = this.teller*br�k2.getNevner();
		this.nevner = this.nevner*br�k2.getTeller();
		this.resultat =  this.teller/this.nevner;
	}
	public double getResultat() {
		return this.resultat;
	}
	public double getNevner() {
		return this.nevner;
	}
	public double getTeller() {
		return this.teller;
	}
	public String toString() {
		return ("Resultat:"+this.resultat+" Nevner:"+this.nevner+" Teller:"+ this.teller);
	}


}
