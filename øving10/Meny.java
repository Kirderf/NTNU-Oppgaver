package øving10;

import java.util.ArrayList;

public class Meny {
	private String menyNavn;
	private ArrayList<Rett> meny;

	Meny(String MenyNavn) {
		ArrayList<Rett> meny = new ArrayList<Rett>();
		this.setMeny(meny);
		this.menyNavn = MenyNavn;
	}
	Meny() {
		ArrayList<Rett> meny = new ArrayList<Rett>();
		this.setMeny(meny);
	}

	public String getMenyNavn() {
		return menyNavn;
	}

	public void setMenyNavn(String menyNavn) {
		this.menyNavn = menyNavn;
	}

	public ArrayList<Rett> getMeny() {
		return meny;
	}

	public void setMeny(ArrayList<Rett> meny) {
		this.meny = meny;
	}
	public boolean addRett(Rett rett) {
		meny.add(rett);
		return true;
	}
	public int getTotalPris() {
		int totalPris = 0;
		for(int i = 0; i < meny.size(); i++) {
			if(meny.get(i) != null) {
			totalPris += meny.get(i).getPris();
			}
		}
		return totalPris;
	}
	@Override
	public String toString() {
		return "\nMeny [menyNavn=" + menyNavn + ", meny=" + meny + "]";
	}
	

}
