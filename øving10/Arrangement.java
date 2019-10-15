package øving10;

import java.util.Comparator;

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
	@Override
	public String toString() {
		return "\nArrangement [nummer=" + nummer + ", navn=" + navn + ", sted=" + sted + ", type=" + type
				+ ", klokkaogdato=" + klokkaogdato + "]";
	}

}
class SortbyTime implements Comparator<Arrangement>{
	@Override
	public int compare(Arrangement o1, Arrangement o2) {
		if(o1.getDatoOgKlokka()>o2.getDatoOgKlokka()) {
			return -1;
		}
		if(o1.getDatoOgKlokka()<o2.getDatoOgKlokka()) {
			return 1;
		}
		return 0;
	}
}

class SortbyName implements Comparator<Arrangement>{
	@Override
	public int compare(Arrangement o1, Arrangement o2) {
		return o1.getNavn().compareTo(o2.getNavn());
	}
}
class SortbyType implements Comparator<Arrangement>{
	@Override
	public int compare(Arrangement o1, Arrangement o2) {
		return o1.getType().compareTo(o2.getType());
	}
}