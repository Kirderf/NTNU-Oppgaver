package øving8;

public class ArbTaker {
	int arbtakernr;
	int ansettelseår;
	double månedslønnBrutto;
	int SKATTEPROSENT = 15;

	java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
	int år = kalender.get(java.util.Calendar.YEAR);

	ArbTaker(Person ArbTaker, int arbtakernr, int ansettelsesår, double månedslønnBrutto) {
		ArbTaker.fødselsår();
		this.arbtakernr = arbtakernr;
		this.ansettelseår = ansettelsesår;
		this.månedslønnBrutto = månedslønnBrutto;
	}

	public double getSkattMåned() {
		return månedslønnBrutto * (SKATTEPROSENT / 100);
	}

	public double getÅrslønn() {
		return månedslønnBrutto * 12;

	}

	public double getSkattÅr() {
		return 10 * getSkattMåned() + getSkattMåned() * 0.5;
	}

	public int getAlder() {
		return this.getAlder();
	}
	public int getÅrAnsatt() {
		return år-this.ansettelseår;
	}
	public boolean sjekkÅrAnsatt(int antallÅr) {
		if(getÅrAnsatt() > antallÅr) {
			return true;
		}
		return false;
		
	}
}
