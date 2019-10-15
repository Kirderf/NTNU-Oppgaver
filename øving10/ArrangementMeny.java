package øving10;

import javax.swing.JOptionPane;

/* Å registrere et nytt arrangement
• Å finne alle arrangementer på et gitt sted
• Å finne alle arrangementer på en gitt dato
• Å finne alle arrangementer innenfor et tidsintervall gitt ved to datoer. Listen skal
være sortert på tid.
• Å lage lister over alle arrangementer, sortert etter henholdsvis sted, type og
tidspunkt 
*/

public class ArrangementMeny {
	public static void main(String[] args) {
		ArrangmentRegister Oversikt = new ArrangmentRegister();
		int svar = 0;
		while (true) {
			try {
			svar = Integer.parseInt(JOptionPane.showInputDialog("1: registrere et nytt arrangement\n"
					+ "2: finne alle arrangementer på et gitt sted\n" + "3: finne alle arrangementer på en gitt dato\n"
					+ "4: finne alle arrangementer innenfor et tidsintervall\n" + "5: print lister\n"
					+ "0: Avslutt\n"));}catch(NumberFormatException NFE) {
						JOptionPane.showMessageDialog(null, "Ikke et gyldig valg");
					}
			if (svar == 0) {
				System.exit(0);
			}
			switch (svar) {
			case (1):
				Oversikt.addArrangement();
				break;
			case (2):
				JOptionPane.showMessageDialog(null, Oversikt.getArrangementer(JOptionPane.showInputDialog("Sted: ")));
				break;
			case (3):
				JOptionPane.showMessageDialog(null,
						Oversikt.getArrangementer(Integer.parseInt(JOptionPane.showInputDialog("(eks: 20190930) Dato: "))));
				break;
			case (4):
				JOptionPane.showMessageDialog(null,
						Oversikt.getArrangementer(Integer.parseInt(JOptionPane.showInputDialog("(eks: 20190930) Dato1: ")),
								Integer.parseInt(JOptionPane.showInputDialog("(eks: 20191030) Dato2: "))));
				break;
			case (5):
				Oversikt.printAllSortList();
				break;
			default:
				break;

			}

		}

	}
}
