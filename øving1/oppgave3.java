package øving1;

// Oppgave 3 Fredrik Julsen 22.08.2019


import java.util.*;


public class oppgave3 {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int sumTimer;
		int sumMinutter;
		int sumSekunder;
		
		System.out.println("Skriv inn antall hele sekunder");
		int antallSekunder = in.nextInt();
		
		if (antallSekunder > 0) {
			
			sumTimer = antallSekunder/(60*60);
			sumMinutter = (antallSekunder%(60*60))/60;
			sumSekunder = ((antallSekunder%(60*60))%60);
		
			System.out.println("Timer: " + sumTimer);
			System.out.println("Minutter: " + sumMinutter);
			System.out.println("Sekunder: " + sumSekunder);
		}else{
			System.out.println("Feil data");
		}
		
		

	}
	

}