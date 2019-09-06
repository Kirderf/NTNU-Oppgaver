package øving5;


public class MinRandom {
	static java.util.Random Random = new java.util.Random();
	
	public static void main(String[] args) {
		
		System.out.println(nesteDesimaltall(0.32,0.32));
		System.out.println(nesteHeltall(201,200));
		System.out.println(nesteDesimaltall(0.31,0.32));
		System.out.println(nesteHeltall(0,200));
	}

	public static int nesteHeltall(int nedre, int ovre) {
		
		int Heltall;
		
		if(ovre<nedre || nedre==ovre) {
			System.out.println("(Heltall) Feil med nedre og ovre grense");
			return(0);
		}
		do {
			Heltall = Random.nextInt();
		}
		while(Heltall < nedre || Heltall > ovre);
		
		return Heltall;
	}
	
	public static double nesteDesimaltall(double nedre, double ovre) {
		double Desimal;
		
		if(ovre<nedre || nedre==ovre) {
			System.out.println("(Desimal) Feil med nedre og ovre grense");
			return 0;
		}
		
		do{
			Desimal = Random.nextDouble();
		}
		while(Desimal < nedre || Desimal > ovre);
		
		
		return Desimal;
	}
}

