package øving8;

public final class Person {
	private String fornavn;
	private String etternavn;
	private int fødselsår;

	Person(String fornavn, String etternavn, int fødselsår) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.fødselsår = fødselsår;
	}

	public String getFornavn() {
		return fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public int getFødselsår() {
		return fødselsår;
	}

	public String toString() {
		return ("Etternavn:" + etternavn + " Fornavn:" + fornavn + " fødselsår" + fødselsår);
	}

}
