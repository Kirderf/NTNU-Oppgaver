package øving8;

public class ArbTaker {
	int arbtakernr;
	int ansettelseår;
	double månedslønnBrutto;
	static final int SKATTEPROSENT = 15;
	Person personalia;

	ArbTaker(Person Person, int arbtakernr, int ansettelsesår, double månedslønnBrutto) {
		this.personalia = Person;
		this.arbtakernr = arbtakernr;
		this.ansettelseår = ansettelsesår;
		this.månedslønnBrutto = månedslønnBrutto;
	}

	java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
	int år = kalender.get(java.util.Calendar.YEAR);

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
		return år - this.personalia.getFødselsår();
	}

	public int getÅrAnsatt() {
		return år - this.ansettelseår;
	}

	public void setAnsettelsesÅr(int år) {
		this.ansettelseår = år;
	}

	public void setArbTakerNr(int nr) {
		this.arbtakernr = nr;
	}
	public void setMånedslønnBrutto(double månedslønnBrutto) {
		this.månedslønnBrutto = månedslønnBrutto;
	}

	public String getFultNavn() {
		return (this.personalia.getEtternavn() + " , " + this.personalia.getFornavn());
	}

	public boolean sjekkÅrAnsatt(int antallÅr) {
		if (getÅrAnsatt() > antallÅr) {
			return true;
		}
		return false;
	}



	public String toString() {
		return (this.getFultNavn() + "\n" + this.getAlder() + "\nArbeidstakernr: " + this.arbtakernr
				+ "\nMånedslønn Brutto: " + this.månedslønnBrutto + "\nSkattbetalt i måneden: " + this.getSkattMåned()
				+ "\nSkattbetalt i året: " + this.getSkattÅr() + "\nSkatteprosent: " + this.SKATTEPROSENT)
				+ "\nÅransatt: " + this.getÅrAnsatt();
	}

}
