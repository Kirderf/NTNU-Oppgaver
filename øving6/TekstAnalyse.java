package øving6;

import java.util.Scanner;

public class TekstAnalyse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isFerdig = false;
		while (!isFerdig) {
			System.out.print("Skriv tekst som skal analyseres: ");
			String Tekster = input.nextLine();
			Teksten Teksten = new Teksten(Tekster);
			System.out.println("Bestemt bokstav som skal analyseres:");
			char G = input.next().toLowerCase().charAt(0);

			System.out.println("Antall tegn: " + Teksten.getTotalTegn());
			System.out.println("Antall forskjellige tegn: " + Teksten.getDiffTegn());
			System.out.println("Antall bokstaver: " + Teksten.getBokstaver());
			System.out.println("Antall bokstaver prosentandel: " + Teksten.getProsentBokstaver());
			System.out.println("Betemt bokstav test: " + Teksten.getBestemtBokstavAntall(G));
			System.out.println("Flest forkommster av bokstaven/e: " + Teksten.getFlestBokstav());

			System.out.println("Ferdig?");
			System.out.println("0:JA");
			System.out.println("1:NEI");
			int ferdig = input.nextInt();
			if (ferdig == 0) {
				System.out.println("Ferdig");
				isFerdig = true;
			}
		}
	}

}
