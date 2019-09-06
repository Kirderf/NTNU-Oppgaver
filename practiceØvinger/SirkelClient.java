package practiceÿvinger;

public class SirkelClient {

	public static void main(String[] args) {
		Sirkel Sirkel1 = new Sirkel(5);
		Sirkel Sirkel2 = new Sirkel(2);
		
		System.out.println(Sirkel1.calcAreal());
		System.out.println(Sirkel2.calcAreal());
		
		System.out.println(Sirkel1.calcDiameter());
		System.out.println(Sirkel2.calcDiameter());
		
		

	}

}
