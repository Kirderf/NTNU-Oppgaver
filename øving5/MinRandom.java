package øving5;


public class MinRandom {
	static java.util.Random Random = new java.util.Random();
	private static int Heltall;
	public static void main(String[] args) {
		for(int i = 0; i< 100; i++) {
		System.out.println(nesteDesimaltall(0.5,1.5));
		System.out.println(nesteHeltall(0,200));
		}
	}

	public static int nesteHeltall(int nedre, int ovre) {
		
		if(ovre<=nedre) {
			System.out.println("(Heltall) Feil med nedre og ovre grense");
			return(0);
		}
		Heltall = (Random.nextInt(ovre-nedre)+nedre);
		
		return Heltall;
	}
	
	public static double nesteDesimaltall(double nedre, double ovre) {
		double Desimal;
		
		if(ovre<=nedre) {
			System.out.println("(Desimal) Feil med nedre og ovre grense");
			return 0;
		}
		
		Desimal = Random.nextDouble()*(ovre-nedre) + nedre;		
		
		return Desimal;
	}
}

