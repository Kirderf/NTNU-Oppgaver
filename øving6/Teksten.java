package øving6;

public class Teksten {
	private int totaltAntallTegn = 0;
	private int diffTegn = 0;
	private boolean erBokstav = false;
	private char[] alfabetet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
			'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'æ', 'ø', 'å', ' ' };
	private int[] antallTegn = new int[30];
	private int bokstavInt = 0;
	private String flestBokstaver = null;

	public Teksten(String teksten) {

		String Teksten = teksten;

		for (int i = 0; i < Teksten.length(); i++) {

			System.out.println(Teksten.toLowerCase().charAt(i));
			for (int j = 0; j <= 29; j++) {
				if (Teksten.toLowerCase().charAt(i) == alfabetet[j]) {
					antallTegn[j]++;
					erBokstav = true;

				}
			}
			if (erBokstav == false) {
				antallTegn[29]++;
			}

			totaltAntallTegn++;

		}
		for (int i = 0; i < alfabetet.length - 1; i++) {

			if (antallTegn[i] > 0) {
				diffTegn++;
			}

			if (antallTegn[i] > bokstavInt) {
				bokstavInt = antallTegn[i];
				flestBokstaver = String.valueOf(alfabetet[i]);
			} else if (antallTegn[i] == bokstavInt) {
				flestBokstaver += String.valueOf(alfabetet[i]);
			}

		}
	}

	public int getTotalTegn() {
		return totaltAntallTegn;
	}

	public int getDiffTegn() {
		return diffTegn;
	}

	public int getBokstaver() {
		return totaltAntallTegn - antallTegn[29];
	}

	public int getProsentBokstaver() {
		if (getTotalTegn() == getBokstaver()) {
			return 100;
		}
		return (100 / getTotalTegn()) * getBokstaver();
	}

	public int getBestemtBokstavAntall(char bokstav) {
		for (int i = 0; i < 29; i++) {
			if (bokstav == alfabetet[i]) {
				return antallTegn[i];
			}
		}
		return 0;
	}

	public String getFlestBokstav() {
		return (flestBokstaver.toUpperCase());

	}
}
