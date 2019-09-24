package øving8;

public class ArbTaker extends Person {
	int arbtakernr;
	int ansettelseår;
	double månedslønnBrutto;
	int SKATTEPROSENT = 15;
	java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
	int år = kalender.get(java.util.Calendar.YEAR);

	ArbTaker(String fornavn, String etternavn, int fødselsår, int arbtakernr, int ansettelsesår,
			double månedslønnBrutto) {
		super(fornavn, etternavn, fødselsår);
		this.arbtakernr = arbtakernr;
		this.ansettelseår = ansettelsesår;
		this.månedslønnBrutto = månedslønnBrutto;

	}

	public String toString() {
		return (this.getFultNavn() + "\n" + this.getAlder() + "\n" + "Arbeidstakernr: " + this.arbtakernr + "\n"
				+ "Månedslønn Brutto: " + this.månedslønnBrutto + "\n" + "Skattbetalt i måneden: "
				+ this.getSkattMåned() + "\n" + "Skattbetalt i året: " + this.getSkattÅr() + "\n" + "Skatteprosent: "
				+ this.SKATTEPROSENT);
	}

	public double getSkattMåned() {
		return månedslønnBrutto * ((double) SKATTEPROSENT / 100);
	}

	public double getÅrslønn() {
		return månedslønnBrutto * 12;

	}

	public double getSkattÅr() {
		return 10 * getSkattMåned() + getSkattMåned() * 0.5;
	}

	public int getAlder() {
		return år - this.fødselsår;
	}

	public int getÅrAnsatt() {
		return år - this.ansettelseår;
	}

	public String getFultNavn() {
		return (this.etternavn + " , " + this.fornavn);
	}

	public boolean sjekkÅrAnsatt(int antallÅr) {
		if (getÅrAnsatt() > antallÅr) {
			return true;
		}
		return false;

	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public void setMånedslønnBrutto(double månedslønnBrutto) {
		this.månedslønnBrutto = månedslønnBrutto;
	}

	public void setFødselsår(int fødselsår) {
		this.fødselsår = fødselsår;

	}

}
