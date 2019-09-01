package øving1;

// Oppgave1 Fredrik Julsen 2019.08.22


import java.util.*;


public class oppgave1{
	
	public static void main(String[] args) {
		System.out.println("Kalkulator for tommer til centimeter");
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Tommer: ");
		double tommer = in.nextDouble();
		double centimeter;
		
		
		if (tommer > 0) {
			centimeter = tommer*2.54;
			System.out.println(tommer + " tommer er " + centimeter + "cm");
		}
		else{
		System.out.println("Feil data");
		}
		
		

	}
	
}
