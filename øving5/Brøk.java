package øving5;

public class Brøk {
	private double nevner;
	private double teller;
	private double resultat;
	
	public Brøk(double teller, double nevner) {
		  if (nevner == 0) {
			    throw new IllegalArgumentException("Nevner kan ikke være null");
		  }
		  this.nevner = nevner;
		  this.teller = teller;
		  this.resultat = teller/nevner;
	}
	public Brøk(double teller) {
		this.nevner = 1;
		this.teller = teller;
		this.resultat = teller/nevner;
	}
	
	public void calcSum(Brøk brøk2) {
		this.teller = (this.teller*brøk2.getNevner())+(brøk2.getTeller()*this.nevner);
		this.nevner = (this.nevner*brøk2.getNevner());
		this.resultat = (this.teller/this.nevner);
						
	}
	public void calcSub(Brøk brøk2) {
		this.teller = (this.teller*brøk2.getNevner())-(brøk2.getTeller()*this.nevner);
		this.nevner = (this.nevner*brøk2.getNevner());
		this.resultat = (this.teller/this.nevner);
	}
	public void calcMulti(Brøk brøk2) {
		this.teller = this.teller*brøk2.getTeller();
		this.nevner = this.nevner*brøk2.getNevner();
		this.resultat =  this.teller/this.nevner;
	}
	public void calcDel(Brøk brøk2) {
		this.teller = this.teller*brøk2.getNevner();
		this.nevner = this.nevner*brøk2.getTeller();
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
