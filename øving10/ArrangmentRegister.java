package øving10;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class ArrangmentRegister {
	private int arrangementNummer;
	private ArrayList<Arrangement> arrangementer;

	public ArrangmentRegister() {
		ArrayList<Arrangement> arrangementer = new ArrayList<Arrangement>();
		this.arrangementer = arrangementer;
	}

	public int getAntallArrangementer() {
		return arrangementer.size();
	}

	public void setArrangementNummer(Arrangement noe) {
		noe.setNummer(arrangementNummer+1);
	}

	public void nyttArrangement() {
		String name = JOptionPane.showInputDialog(null, "Navnet på arrangementet?");
		String sted = JOptionPane.showInputDialog(null, "Hvor er arrangementet?");
		String type = JOptionPane.showInputDialog(null, "Hva slags type arrangement?");
		Long tid = Long.parseLong(JOptionPane.showInputDialog("Når er arrangementet? (eks 201909301700)"));
		Arrangement arg = new Arrangement(name, sted, type, tid);
		arrangementer.add(arg);
		setArrangementNummer(arg);
		arrangementNummer++;

	}

	public void TidSortere(ArrayList<Arrangement> Arrangementer) {
		this.arrangementer = Arrangementer;
	}

	public ArrayList<Arrangement> getArrangementTidSortert() {
		Collections.sort();

	}

	@Override
	public String toString() {
		return "ArrangmentRegister [antallArrangementer=" + getAntallArrangementer() + ", arrangementer="
				+ arrangementer + "]";
	}
}
