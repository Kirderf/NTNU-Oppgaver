package �ving8;

public class ArbTaker {
	int arbtakernr;
	int ansettelse�r;
	double m�nedsl�nnBrutto;
	static final int SKATTEPROSENT = 15;
	Person personalia;

	ArbTaker(Person Person, int arbtakernr, int ansettelses�r, double m�nedsl�nnBrutto) {
		this.personalia = Person;
		this.arbtakernr = arbtakernr;
		this.ansettelse�r = ansettelses�r;
		this.m�nedsl�nnBrutto = m�nedsl�nnBrutto;
	}

	java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
	int �r = kalender.get(java.util.Calendar.YEAR);

	public double getSkattM�ned() {
		return m�nedsl�nnBrutto * ((double) SKATTEPROSENT / 100);
	}

	public double get�rsl�nn() {
		return m�nedsl�nnBrutto * 12;
	}

	public double getSkatt�r() {
		return 10 * getSkattM�ned() + getSkattM�ned() * 0.5;
	}

	public int getAlder() {
		return �r - this.personalia.getF�dsels�r();
	}

	public int get�rAnsatt() {
		return �r - this.ansettelse�r;
	}

	public void setAnsettelses�r(int �r) {
		this.ansettelse�r = �r;
	}

	public void setArbTakerNr(int nr) {
		this.arbtakernr = nr;
	}
	public void setM�nedsl�nnBrutto(double m�nedsl�nnBrutto) {
		this.m�nedsl�nnBrutto = m�nedsl�nnBrutto;
	}

	public String getFultNavn() {
		return (this.personalia.getEtternavn() + " , " + this.personalia.getFornavn());
	}

	public boolean sjekk�rAnsatt(int antall�r) {
		if (get�rAnsatt() > antall�r) {
			return true;
		}
		return false;
	}



	public String toString() {
		return (this.getFultNavn() + "\n" + this.getAlder() + "\nArbeidstakernr: " + this.arbtakernr
				+ "\nM�nedsl�nn Brutto: " + this.m�nedsl�nnBrutto + "\nSkattbetalt i m�neden: " + this.getSkattM�ned()
				+ "\nSkattbetalt i �ret: " + this.getSkatt�r() + "\nSkatteprosent: " + this.SKATTEPROSENT)
				+ "\n�ransatt: " + this.get�rAnsatt();
	}

}
