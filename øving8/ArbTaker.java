package �ving8;

public class ArbTaker extends Person {
	int arbtakernr;
	int ansettelse�r;
	double m�nedsl�nnBrutto;
	int SKATTEPROSENT = 15;
	java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
	int �r = kalender.get(java.util.Calendar.YEAR);

	ArbTaker(String fornavn, String etternavn, int f�dsels�r, int arbtakernr, int ansettelses�r,
			double m�nedsl�nnBrutto) {
		super(fornavn, etternavn, f�dsels�r);
		this.arbtakernr = arbtakernr;
		this.ansettelse�r = ansettelses�r;
		this.m�nedsl�nnBrutto = m�nedsl�nnBrutto;

	}

	public String toString() {
		return (this.getFultNavn() + "\n" + this.getAlder() + "\n" + "Arbeidstakernr: " + this.arbtakernr + "\n"
				+ "M�nedsl�nn Brutto: " + this.m�nedsl�nnBrutto + "\n" + "Skattbetalt i m�neden: "
				+ this.getSkattM�ned() + "\n" + "Skattbetalt i �ret: " + this.getSkatt�r() + "\n" + "Skatteprosent: "
				+ this.SKATTEPROSENT);
	}

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
		return �r - this.f�dsels�r;
	}

	public int get�rAnsatt() {
		return �r - this.ansettelse�r;
	}

	public String getFultNavn() {
		return (this.etternavn + " , " + this.fornavn);
	}

	public boolean sjekk�rAnsatt(int antall�r) {
		if (get�rAnsatt() > antall�r) {
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

	public void setM�nedsl�nnBrutto(double m�nedsl�nnBrutto) {
		this.m�nedsl�nnBrutto = m�nedsl�nnBrutto;
	}

	public void setF�dsels�r(int f�dsels�r) {
		this.f�dsels�r = f�dsels�r;

	}

}
