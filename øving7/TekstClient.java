package øving7;

public class TekstClient {

	public static void main(String[] args) {
		TekstBehandling Tekst1 = new TekstBehandling("Dette er en tekst. Dette er en test! Ta den. Været er dårlig.");
		System.out.println("Antall ord " + Tekst1.finnOrd());
		System.out.println("Gjennomsnittlig ord lengde er " + Tekst1.finnGjennomsnittligOrdLengde());
		System.out.println("Gjennomsnittlig antall ord per periode er " + Tekst1.finnGjennomsnittligAntallOrdPerPeriode());
		Tekst1.replace("dette", "det");
		System.out.println(Tekst1.getTeksten());
		System.out.println(Tekst1.getTeksten().toUpperCase());
	}

}
