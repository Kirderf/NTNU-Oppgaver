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

	public ArrayList<Arrangement> getArrangementList() {
		return this.arrangementer;
	}

	public void setArrangementNummer(Arrangement ob) {
		ob.setNummer(arrangementNummer + 1);
	}

	public void addArrangement() {
		String name = JOptionPane.showInputDialog(null, "Navnet på arrangementet?");
		String sted = JOptionPane.showInputDialog(null, "Hvor er arrangementet?");
		String arrangør = JOptionPane.showInputDialog(null, "Hvem er arrangør?");
		String type = JOptionPane.showInputDialog(null, "Hva slags type arrangement?");
		Long tid = Long.parseLong(JOptionPane.showInputDialog("Når er arrangementet? (eks 201909301700)"));
		Arrangement arg = new Arrangement(name, sted, arrangør, type, tid);
		arrangementer.add(arg);
		setArrangementNummer(arg);
		arrangementNummer++;
	}

	public ArrayList<Arrangement> getArrangementer(String sted) {
		ArrayList<Arrangement> arrangementerSortSted = new ArrayList<Arrangement>();

		for (int i = 0; i < arrangementer.size(); i++) {
			if (arrangementer.get(i).getSted().equals(sted)) {
				arrangementerSortSted.add(arrangementer.get(i));
			}
		}
		return arrangementerSortSted;
	}

	public ArrayList<Arrangement> getArrangementer(int dato) {
		ArrayList<Arrangement> arrangementerSortMellomDato = new ArrayList<Arrangement>();
		Long dato1L = Long.parseLong(String.valueOf(dato) + "0000");
		Long dato2L = Long.parseLong(String.valueOf(dato) + "9999");
		for (int i = 0; i < arrangementer.size(); i++) {
			if (dato1L <= arrangementer.get(i).getDatoOgKlokka() && arrangementer.get(i).getDatoOgKlokka() <= dato2L) {
				arrangementerSortMellomDato.add(arrangementer.get(i));
			}
		}
		Collections.sort(arrangementerSortMellomDato, new SortbyTime());
		return arrangementerSortMellomDato;
	}

	public ArrayList<Arrangement> getArrangementer(int dato1, int dato2) {
		ArrayList<Arrangement> arrangementerSortMellomDato = new ArrayList<Arrangement>();
		Long dato1L = Long.parseLong(String.valueOf(dato1) + "0000");
		Long dato2L = Long.parseLong(String.valueOf(dato2) + "0000");
		for (int i = 0; i < arrangementer.size(); i++) {
			if (dato1L <= arrangementer.get(i).getDatoOgKlokka() && arrangementer.get(i).getDatoOgKlokka() <= dato2L) {
				arrangementerSortMellomDato.add(arrangementer.get(i));
			}
		}
		Collections.sort(arrangementerSortMellomDato, new SortbyTime());
		return arrangementerSortMellomDato;
	}

	public void printAllSortList() {
		System.out.println("\nSorterer etter Navn");
		Collections.sort(arrangementer, new SortbyName());
		for (int i = 0; i < arrangementer.size(); i++)
			System.out.println(arrangementer.get(i));

		System.out.println("\nSorterer etter Tid");
		Collections.sort(arrangementer, new SortbyTime());
		for (int i = 0; i < arrangementer.size(); i++)
			System.out.println(arrangementer.get(i));

		System.out.println("\nSorterer etter Type");
		Collections.sort(arrangementer, new SortbyType());
		for (int i = 0; i < arrangementer.size(); i++)
			System.out.println(arrangementer.get(i));

	}

	public void TidSortere(ArrayList<Arrangement> Arrangementer) {
		this.arrangementer = Arrangementer;
	}

	@Override
	public String toString() {
		return "ArrangmentRegister [antallArrangementer=" + getAntallArrangementer() + ", arrangementer="
				+ arrangementer + "]";
	}
}
