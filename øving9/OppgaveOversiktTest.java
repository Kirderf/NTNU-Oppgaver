package �ving9;

import java.util.*;

import javax.swing.JOptionPane;

public class OppgaveOversiktTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int svar = 0;

		OppgaveOversikt Oversikt = new OppgaveOversikt();
		Oversikt.getStudenter().add(0, new Student("root", 0));
		System.out.println(Oversikt.getStudenter().get(0).getNAvn());
		System.out.println(Oversikt.finnAntallStudenter());

		while (true) {
			svar = Integer.parseInt(JOptionPane.showInputDialog(
					"1: Ny Student\n"
					+ "2: Finne antall Studenter\n"
					+ "3: Endre antall godkjente oppgaver til en student\n"
					+ "4: Finn antall godkjente oppgaver til en student\n"
					+ "5: Skriv ut alle studenter til konsoll\n"
					+ "0: Avslutt\n"
					));
			if (svar == 0) {
				System.exit(0);
			}
			if (svar == 1) {
				while (svar != 0) {
					Oversikt.nyStudent();
					svar = Integer.parseInt(JOptionPane.showInputDialog(
							"Legge til flere?\n"
							+ "1: Ja\n"
							+ "0: Nei"
							));
					if (svar == 0) {
						break;
					}
				}
			} else if (svar == 2) {
				JOptionPane.showMessageDialog(null, "Antall Studenter er :" + Oversikt.finnAntallStudenter());
			} else if (svar == 3) {
				Oversikt.toString();
				Oversikt.�kOppgaverStudent();
			} else if (svar == 4) {
				Oversikt.toString();
				Oversikt.finnAntallOppgStudent();
			} else if (svar == 5) {
				for (int i = Oversikt.getStudenter().size() - 2; i >= 0; i--) {
					System.out.println("\n" + Oversikt.getStudenter().get(i).toString());
				}
			}
		}
	}
}
