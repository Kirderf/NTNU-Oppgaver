package practiceÿvinger;
public class Sirkel {
	private double radius;

	public Sirkel(double radius) {
		this.radius = radius;
	}
	
	public double calcAreal() {
		return 3.1415*(radius*radius);
	}
	public double calcDiameter() {
		return 2*3.1415*radius;
	}

	public String toString() {
		return ("Radius:" + radius);
	}
}
