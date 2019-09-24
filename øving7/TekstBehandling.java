package �ving7;

import java.util.ArrayList;

/*
 * Lag en klasse for enkel tekstbehandling. Konstrukt�ren skal ta en tekst som argument.
Klassen skal tilby f�lgende tjenester:
� � finne antall ord i teksten.

� � finne gjennomsnittlig ordlengde. Skilletegn er ikke en del av ordene.

� � finne gjennomsnittlig antall ord per periode. Bruk punktum, utropstegn, kolon og
sp�rretegn som skilletegn mellom periodene. Anta at teksten er feilfri, slik at ikke to
eller flere slike tegn f�lger etter hverandre.

� � skifte ut et ord med et annet gjennom hele teksten. For eksempel kan en �nske �
skifte ut ordet �finnes� med �fins�.

� � hente ut teksten slik den st�r, uten endringer.

� � hente ut teksten, men slik at alle bokstaver er store.

Lag en enkel testklient. Husk � pr�ve klassen for tekster som inneholder �, � og �.
 */
public final class TekstBehandling {
	private String Teksten;
	private String[] ordMedTegn = {};
	private String[] ordUtenTegn = {};
	private char[] skilleTegn = { '.', ',', '!', '?' };
	private int[] ordLengder;

	public TekstBehandling(String Teksten) {
		this.Teksten = Teksten;

	}

	public int finnOrd() {
		ordMedTegn = Teksten.toLowerCase().split(" ");
		return ordMedTegn.length;
	}

	public int finnGjennomsnittligOrdLengde() {
		String nyTeksten = Teksten;
		for (int i = 0; i < Teksten.length(); i++) {
			for (int j = 0; j < skilleTegn.length; j++) {
				if (Teksten.charAt(i) == skilleTegn[j]) {
					nyTeksten = Teksten.replace(Teksten.charAt(i), '\0');
				}

			}
		}
		ordUtenTegn = nyTeksten.toLowerCase().split(" ");
		System.err.println(ordUtenTegn.length);
		int tegnCounter = 0;
		for (int i = 0; i < ordUtenTegn.length; i++) {
			tegnCounter += ordUtenTegn[i].length();
		}
		System.err.println(tegnCounter);
		return tegnCounter / finnOrd();
	}

	public double finnGjennomsnittligAntallOrdPerPeriode() {
		ArrayList<String> perioder = new ArrayList<String>();
		int periodeStart = 0;
		int periodeSlutt = 0;
		for (int i = 0; i < Teksten.length(); i++) {
			System.err.println(Teksten.charAt(i));
			for (int j = 0; j < skilleTegn.length; j++) {
				if (Teksten.charAt(i) == skilleTegn[j]) {
					periodeSlutt = i + 1;
					perioder.add(Teksten.substring(periodeStart, periodeSlutt));
					System.err.println("Funnet skilleTegn");

				}
			}
			periodeStart = periodeSlutt;

		}
		System.err.println(perioder);
		return (double) finnOrd() / (double) perioder.toArray().length;
	}

	public void replace(String gammeltOrd, String nyttOrd) {
		this.Teksten = Teksten.toLowerCase().replaceAll(gammeltOrd, nyttOrd);

	}

	public String[] getOrdmedTegn() {
		return ordMedTegn;
	}

	public int[] getOrdLengder() {
		return ordLengder;
	}

	public char[] getSkilleTegn() {
		return skilleTegn;
	}

	public String getTeksten() {
		return Teksten;
	}

}
