package øving4;

import java.util.Scanner;

public class ValutaKonvertering {
	private static Scanner in = new Scanner(System.in);
	private static int valgMeny1;
	private static int valgMeny2;
	private static int valgMeny3;
	private static int valgMeny4;
	private static String currentValuta;
	private static double currentValutaRate;
	private static double valutaVerdi;

	public static void main(String[] args) {
		Valuta USD = new Valuta("USD", 8.95856663);
		Valuta EUR = new Valuta("EUR", 10.0698768);
		Valuta SEK = new Valuta("SEK", 0.932541993);
		

		while(true) {
			// Meny 1
			System.out.println("Konverteringsvei:");
			System.out.println("1: Fra NOK");
			System.out.println("2: Til NOK");
			valgMeny1 = in.nextInt();
			
			if (valgMeny1 == 1) {
				System.out.println("TIL");
			}else if(valgMeny1 == 2) {
				System.out.println("FRA");
			}
			//Spør hvilken valuta som skal konverteres
			// Meny 2
			System.out.println("1: Dollar");
			System.out.println("2: Euro");
			System.out.println("3: Svenske kroner");
			System.out.println("4: Avslutt");
			System.out.print("Valg :");
			valgMeny2 = in.nextInt();
			
			
			currentValuta = null;
			currentValutaRate = 0;
			
			
			if (valgMeny2 == 4) {
				break;
			}else if (valgMeny2 == 1) {
				currentValuta = USD.valutaName;
				currentValutaRate = USD.NOKRATE;
			}else if (valgMeny2 == 2) {
				currentValuta = EUR.valutaName;
				currentValutaRate = EUR.NOKRATE;
			}else if (valgMeny2 == 3) {
				currentValuta = SEK.valutaName;
				currentValutaRate = SEK.NOKRATE;
			}
			
			
			System.out.println("Valuta: " + currentValuta + " Rate: " + currentValutaRate);
			
			
			//Spør hvilket beløp som skal konverteres
			//Meny 3
			System.out.println("Beløp");
			System.out.println("1: 200");
			System.out.println("2: 100");
			System.out.println("3: 50");
			System.out.println("4: Annet");
			System.out.println("5: Avslutt");
			
			valutaVerdi = 0;
			valgMeny3 = 0;
			System.out.print("Valg :");
			valgMeny3 = in.nextInt();
			
			if (valgMeny3 == 1) {
				valutaVerdi = 200;
			}else if (valgMeny3 == 2) {
				valutaVerdi = 100;
			}else if (valgMeny3 == 3) {
				valutaVerdi = 50;
			}else if (valgMeny3 == 4) {
				System.out.print("Beløp: ");
				valutaVerdi = in.nextDouble();
			}else if (valgMeny3 == 5) {
				break;
			}
			if (valgMeny1 == 1) {
				System.out.println("NOK "+ valutaVerdi+" er " + currentValuta + Valuta.fraNOK(currentValutaRate, valutaVerdi));
			}else if (valgMeny1 == 2) {
				System.out.println(valutaVerdi + " " + currentValuta + " er " + "NOK " + Valuta.tilNOK(currentValutaRate, valutaVerdi)  );
			}
			//Meny 4
			System.out.println("Fortsette?");	
			System.out.println("1: JA");
			System.out.println("2: NEI");
			System.out.print("Valg: ");
			valgMeny4 = in.nextInt();
			if (valgMeny4 == 2) {
				System.exit(0);
			}
		}

	}
}
