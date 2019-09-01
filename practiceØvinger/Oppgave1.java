package practiceØvinger;
import java.util.Scanner;


public class Oppgave1 {
	public class valuta{
		String ValutaName;
		final double NokRate;
		valuta(String name, double rate){
			this.ValutaName = name;
			this.NokRate = rate;
		}
	}
	public static void main(String[] args) {
		while(true) {
				Scanner in = new Scanner(System.in);
				
				//Spør hvilken valuta som skal konverteres
				System.out.println("1: Dollar");
				System.out.println("2: Euro");
				System.out.println("3: Svenske kroner");
				System.out.println("4: Avslutt");
				System.out.print("Valg :");
				int valg = in.nextInt();
				if (valg == 4) {
					break;
				}
				//Spør hvilken beløp som skal konverteres
				System.out.println("Beløp");
				System.out.println("1: 200");
				System.out.println("2: 100");
				System.out.println("3: 50");
				System.out.println("4: Annet");
				System.out.println("5: Avslutt");
				
				int valutaVerdi = 0;
				System.out.print("Valg :");
				int valutaValgVerdi = in.nextInt();
				
				// Endrer valutaVerdi til riktig beløp
				if (valutaValgVerdi == 5) {
					break;	
				}else if(valutaValgVerdi == 1) {
					valutaVerdi = 200;
				}else if(valutaValgVerdi == 2) {
					valutaVerdi = 100;
				}else if(valutaValgVerdi == 3) {
					valutaVerdi = 50;
				}else if(valutaValgVerdi == 4) {
					System.out.print("Beløp :");
					valutaVerdi = in.nextInt();
				}
				
				
				switch(valg) {
				
				case(1):
					System.out.println(valutaVerdi + " USD er " + fromUSD(valutaVerdi) + " NOK");
					break;
				case(2):
					System.out.println(valutaVerdi + " EURO er " + fromEURO(valutaVerdi) + "NOK");
					break;
				case(3):
					System.out.println(valutaVerdi + " SEK er " + fromSEK(valutaVerdi) + "NOK");
					break;
				}
				System.out.println("Fortsette? J/N :");	
				String Svar = in.next();
				if ((Svar == "N") || (Svar == "n")) {
					break;
				}
			}
		}
	
	// DATO 24.08.2019 - TID 15:30 for når valutakurser er hentet
	public final static double  USDNOKRate = 8.95856663;
	public final static double EURONOKRate = 10.0698768;
	public final static double SEKNOKRate = 0.932541993;
	valuta USD = new valuta("USD", USDNOKRate);
	valuta EURO = new valuta("EURO", EURONOKRate);
	valuta SEK = new valuta("SEK", SEKNOKRate);
	
	
	//Methoder for valuta til NOK
	public static double fromUSD(int USDvalue) {
		double NOKvalue = (USDvalue*USDNOKRate);
		return NOKvalue;
		}
	public static double fromEURO(int EUROvalue) {
		double NOKvalue = (EUROvalue*EURONOKRate);
		return NOKvalue;
		}
	public static double fromSEK(int SEKvalue) {
		double NOKvalue = (SEKvalue*SEKNOKRate);
		return NOKvalue;
		}
	
	//Metoder for NOK til Valuta
	public static double toUSD(int NOKvalue) {
		double USDvalue = (NOKvalue/USDNOKRate);
		return USDvalue;
		}
	public static double toEURO(int NOKvalue) {
		double EUROvalue = (NOKvalue/EURONOKRate);
		return EUROvalue;
		}
	public static double toSEK(int NOKvalue) {
		double SEKvalue = (NOKvalue/SEKNOKRate);
		return SEKvalue;
		}

}
