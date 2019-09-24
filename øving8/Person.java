package �ving8;

public class Person {
	protected String fornavn;
	protected String etternavn;
	protected int f�dsels�r;

	Person(String fornavn, String etternavn, int f�dsels�r) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.f�dsels�r = f�dsels�r;
	}

	public String getFornavn() {
		return fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public int getF�dsels�r() {
		return f�dsels�r;
	}

	public String toString() {
		return ("Etternavn:" + etternavn + " Fornavn:" + fornavn + " f�dsels�r" + f�dsels�r);
	}

}
