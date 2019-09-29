package �ving9;

public final class Student {
	private String navn;
	private int antOppg;

	Student(String navn, int antOppg) {
		this.navn = navn;
		this.antOppg = antOppg;
	}

	public String getNAvn() {
		return navn;
	}

	public int getAntOppg() {
		return antOppg;
	}

	public void �kAntOppg(int �kning) {
		antOppg += �kning;
	}

	public boolean navnEqualsTo(String navn) {
		return this.navn.equals(navn);
	}

	public String toString() {
		return "Navn: " + this.navn + " \nAntall godkjente oppgaver: " + this.antOppg;
	}

}
