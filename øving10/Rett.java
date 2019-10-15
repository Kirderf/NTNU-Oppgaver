package øving10;

public class Rett {
	private String name;
	private String type;
	private int pris;
	private String oppskrift;

	Rett(String name, String type, int pris , String oppskrift) {
		setName(name);
		setType(type);
		setPris(pris);
		setOppskrift(oppskrift);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPris() {
		return pris;
	}

	public void setPris(int pris) {
		this.pris = pris;
	}

	public String getOppskrift() {
		return oppskrift;
	}

	public void setOppskrift(String oppskrift) {
		this.oppskrift = oppskrift;
	}

	@Override
	public String toString() {
		return "\nRett [name=" + name + ", type=" + type + ", pris=" + pris + "]";
	}

}
