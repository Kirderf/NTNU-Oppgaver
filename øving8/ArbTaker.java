package �ving8;

public class ArbTaker {
	int arbtakernr;
	int ansettelse�r;
	double m�nedsl�nnBrutto;
	int SKATTEPROSENT = 15;

	java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
	int �r = kalender.get(java.util.Calendar.YEAR);

	ArbTaker(Person ArbTaker, int arbtakernr, int ansettelses�r, double m�nedsl�nnBrutto) {
		ArbTaker.f�dsels�r();
		this.arbtakernr = arbtakernr;
		this.ansettelse�r = ansettelses�r;
		this.m�nedsl�nnBrutto = m�nedsl�nnBrutto;
	}

	public double getSkattM�ned() {
		return m�nedsl�nnBrutto * (SKATTEPROSENT / 100);
	}

	public double get�rsl�nn() {
		return m�nedsl�nnBrutto * 12;

	}

	public double getSkatt�r() {
		return 10 * getSkattM�ned() + getSkattM�ned() * 0.5;
	}

	public int getAlder() {
		return this.getAlder();
	}
	public int get�rAnsatt() {
		return �r-this.ansettelse�r;
	}
	public boolean sjekk�rAnsatt(int antall�r) {
		if(get�rAnsatt() > antall�r) {
			return true;
		}
		return false;
		
	}
}
