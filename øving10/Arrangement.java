package øving10;

/* Å registrere et nytt arrangement
• Å finne alle arrangementer på et gitt sted
• Å finne alle arrangementer på en gitt dato
• Å finne alle arrangementer innenfor et tidsintervall gitt ved to datoer. Listen skal
være sortert på tid.
• Å lage lister over alle arrangementer, sortert etter henholdsvis sted, type og
tidspunkt 
*/

public class Arrangement {
	private int nummer;
	private String navn;
	private String sted;
	private String type;
	private long klokkaogdato;

	public Arrangement(String navn, String sted, String type, long datoklokkeslett) { // registrere ett nytt arrangment
		this.setNavn(navn);
		this.setType(type);
		this.setSted(sted);
		this.setKlokkaogdato(datoklokkeslett);

	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getSted() {
		return sted;
	}

	public void setSted(String sted) {
		this.sted = sted;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getDatoOgKlokka() {
		return klokkaogdato;
	}

	public void setKlokkaogdato(long datoklokkeslett) {
		this.klokkaogdato = datoklokkeslett;
	}

	public boolean tidIsSmaller(int datoogklokka) {
		if (this.getDatoOgKlokka() < datoogklokka) {
			return true;
		} else {
			return false;
		}
	}

	public boolean tidIsBigger(int datoogklokka) {
		if (this.getDatoOgKlokka() > datoogklokka) {
			return true;
		} else {
			return false;
		}
	}
	public long compareTo(long datoogklokka) {
		if
	}
	@Override
	public String toString() {
		return "Arrangement [nummer=" + nummer + ", navn=" + navn + ", sted=" + sted + ", type=" + type
				+ ", klokkaogdato=" + klokkaogdato + "]";
	}

}
