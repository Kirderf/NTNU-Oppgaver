package øving7;

import java.util.Scanner;

public class TekstClient {

	public static void main(String[] args) {
		java.util.Scanner inScanner = new Scanner(System.in);
		System.out.println("Input next: ");
		String tekst = inScanner.nextLine();
		
		
		TekstBehandling Tekst1 = new TekstBehandling(tekst);
		
		System.out.println("Antall ord " + Tekst1.finnOrd());
		System.out.println("Gjennomsnittlig ord lengde er " + Tekst1.finnGjennomsnittligOrdLengde());
		System.out.println(
				"Gjennomsnittlig antall ord per periode er " + Tekst1.finnGjennomsnittligAntallOrdPerPeriode());
		Tekst1.replace("dette", "det");
		System.out.println(Tekst1.getTeksten());
		System.out.println(Tekst1.getTeksten().toUpperCase());
	}

}
