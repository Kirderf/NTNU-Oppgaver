package øving9;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.naming.InvalidNameException;


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
		Scanner in = new Scanner(System.in);
		System.out.println("Hvilken student vil du finne godkjente oppgaver til ?");
		String student = in.next();
		for (int i = 0; i < studenter.size(); i++) {
			try {
				if (studenter.get(i).navnEqualsTo(student)) {
					throw new FindException();
				}
			} catch (FindException FE) {
				System.out.println(student + " er en student");
				System.out.println("Godkjente oppgaver er : " + studenter.get(i).getAntOppg());
			}
		}

	}

	public ArrayList<Student> getStudenter() {
		return studenter;
	}

	public void økOppgaverStudent() {
		Scanner in = new Scanner(System.in);
		System.out.println("Hvilken student vil du endre ?");
		String student = in.next();
		for (int i = 0; i < studenter.size(); i++) {
			try {
				if (studenter.get(i).navnEqualsTo(student)) {
					throw new FindException();
				}
			} catch (FindException FE) {
				System.out.println(student + " er en student");
				System.out.println("Hva er økningen?");
				int økning = in.nextInt();
				studenter.get(i).økAntOppg(økning);
			}
		}

	}

	public void nyStudent() {

		Scanner in = new Scanner(System.in);
		System.out.println("Navn: ");
		String navn = in.nextLine();
		for (int i = 0; i < studenter.size(); i++) {
			System.out.println(i);
			try {
				if (studenter.get(i).navnEqualsTo(navn)) {
					throw new InvalidNameException();
				}
			} catch (InvalidNameException INE) {
				System.out.println(navn + " er opptatt");
				return;
			}
		}
		System.out.println("Student added");
		studenter.add(antStud, new Student(navn, 0));
		antStud++;

	}

	public String toString() {
		for (int i = studenter.size() - 2; i >= 0; i--) {
			System.out.println(studenter.get(i).getNAvn());
		}
		return "Antallstudenter: " + antStud;

	}
}
