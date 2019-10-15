package øving9;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OppgaveOversikt {

	private ArrayList<Student> studenter; // tabellen opprettes i konstruktøren
	private int antStud = 0; // økes med 1 for hver ny student

	OppgaveOversikt() {
		this.studenter = new ArrayList<Student>();
	}
	
	
	
	public ArrayList<Student> getStudenter() {
		return studenter;
	}
	public int finnAntallStudenter() {
		return antStud; // kan også returnere studenter.size() - 1 for samme verdi
	}

	public void finnAntallOppgStudent() {
		String student = JOptionPane.showInputDialog("Hvilken student vil du finne godkjente oppgaver til ?");
		for (int i = 0; i < studenter.size(); i++) {
			if (studenter.get(i).navnEqualsTo(student)) {
				JOptionPane.showMessageDialog(null, student + " er en student");
				JOptionPane.showMessageDialog(null, "Godkjente oppgaver er : " + studenter.get(i).getAntOppg());
				return;
			}
		}
		JOptionPane.showMessageDialog(null, student + " er ikke en student");

	}

	public void økOppgaverStudent() {
		String student = JOptionPane.showInputDialog("Hvilken student vil du endre ?");
		for (int i = 0; i < studenter.size(); i++) {
			if (studenter.get(i).navnEqualsTo(student)) {
				JOptionPane.showMessageDialog(null, student + " er en student");
				studenter.get(i).økAntOppg(Integer.parseInt(JOptionPane.showInputDialog("Hva er økningen?")));
				return;
			}
		}
		JOptionPane.showMessageDialog(null, student + " er ikke en student");
	}

	public void nyStudent() {
		String navn = JOptionPane.showInputDialog("Navnet på den nye studenten: ");
		for (int i = 0; i < studenter.size(); i++) {
			if (studenter.get(i).navnEqualsTo(navn)) {
				JOptionPane.showMessageDialog(null, navn + " er opptatt");
				return;
			}
		}
		studenter.add(antStud, new Student(navn, 0));
		antStud++;
		System.out.println("Student added");

	}

	public void printStudenter() {
		String studentertoString = "Studenter:";
		for (int i = studenter.size()-1; i >= 0; i--) {
			studentertoString += "\n" + studenter.get(i).getNAvn();
		}
		JOptionPane.showMessageDialog(null, studentertoString);
	}

	@Override
	public String toString() {
		return "OppgaveOversikt [studenter=" + studenter + ", antStud=" + antStud + "]";
	}
}
