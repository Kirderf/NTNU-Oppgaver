package øving9;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.naming.InvalidNameException;
import javax.naming.NamingException;
import javax.swing.JOptionPane;


public class OppgaveOversikt {

	private ArrayList<Student> studenter; // tabellen opprettes i konstruktøren
	static private int antStud = 0; // økes med 1 for hver ny student

	OppgaveOversikt() {
		ArrayList<Student> studenter = new ArrayList<Student>();
		this.studenter = studenter;
	}

	public int finnAntallStudenter() {
		return antStud; // kan også returnere antStud +1 for samme verdi
	}

	public void finnAntallOppgStudent() {
		String student = JOptionPane.showInputDialog("Hvilken student vil du finne godkjente oppgaver til ?");
		for (int i = 0; i < studenter.size()-1; i++) {
			try {
				if (studenter.get(i).navnEqualsTo(student)) {
					throw new FindException();
				}else {
					throw new NamingException();
				}
			} catch (FindException FE) {
				JOptionPane.showMessageDialog(null, student + " er en student");
				JOptionPane.showMessageDialog(null, "Godkjente oppgaver er : " + studenter.get(i).getAntOppg());
			} catch	(NamingException notInStudenter) {
				JOptionPane.showMessageDialog(null, student +" er ikke en student");
			}
		}

	}

	public ArrayList<Student> getStudenter() {
		return studenter;
	}

	public void økOppgaverStudent() {
		String student = JOptionPane.showInputDialog("Hvilken student vil du endre ?");
		for (int i = 0; i < studenter.size()-1; i++) {
			try {
				if (studenter.get(i).navnEqualsTo(student)) {
					throw new FindException();
				}else {
					throw new NamingException();
				}
			} catch (FindException FE) {
				JOptionPane.showMessageDialog(null, student + " er en student");
				int økning = Integer.parseInt(JOptionPane.showInputDialog("Hva er økningen?"));
				studenter.get(i).økAntOppg(økning);
			} catch	(NamingException notInStudenter) {
				JOptionPane.showMessageDialog(null, student +" er ikke en student");
			}
		}

	}

	public void nyStudent() {
		String navn = JOptionPane.showInputDialog("Navnet på den nye studenten: ");
		for (int i = 0; i < studenter.size(); i++) {
			System.out.println(i);
			try {
				if (studenter.get(i).navnEqualsTo(navn)) {
					throw new InvalidNameException();
				}
			} catch (InvalidNameException INE) {
				JOptionPane.showMessageDialog(null, navn + " er opptatt");
				return;
			}
		}
		System.out.println("Student added");
		studenter.add(antStud, new Student(navn, 0));
		antStud++;

	}

	public String toString() {
		String studentertoString = "Studenter:";
		for (int i = studenter.size() - 2; i >= 0; i--) {
			studentertoString += "\n"+studenter.get(i).getNAvn();
		}
		JOptionPane.showMessageDialog(null, studentertoString);
		return "Antallstudenter: " + antStud;

	}
}
