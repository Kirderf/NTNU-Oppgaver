package �ving1;

// Oppgave 2 Fredrik Julsen 22.08.2019

import java.util.*;




public class oppgave2 {
	public static void main (String[] args) {
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	
	// Får variabler fra bruker
		System.out.println("Antall hele timer: ");
		byte timer = in.nextByte();
		System.out.println("Antall hele minutter: ");
		byte minutter = in.nextByte();	
		System.out.println("Antall hele sekunder: ");
		byte sekunder = in.nextByte();
	
	//Gjør matten fra tidligere variabler til minutter
		int sum = (minutter*60) + sekunder + (timer*60*60);
		if (sum >= 0) {
			System.out.println("Sum i antall sekunder er : " + sum);
		}
		else {
			System.out.println("Feil data");
		}
		
	
	}	

}