package øving9;

import java.util.*;

public class OppgaveOversiktTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int svar = 0;

		OppgaveOversikt Oversikt = new OppgaveOversikt();
		Oversikt.getStudenter().add(0, new Student("root", 0));
		System.out.println(Oversikt.getStudenter().get(0).getNAvn());
		System.out.println(Oversikt.finnAntallStudenter());

		while (true) {
			System.out.println("\nHva vil du gjøre?");
			System.out.println("1: Ny Student");
			System.out.println("2: Finne antall Studenter");
			System.out.println("3: Endre antall godkjente oppgaver til en student");
			System.out.println("4: Finn antall godkjente oppgaver til en student");
			System.out.println("5: Skriv ut alle studenter");
			System.out.println("0: Avslutt");
			svar = in.nextInt();
			if (svar == 0) {
				System.exit(0);
			}
			if (svar == 1) {
				while (svar != 0) {
					Oversikt.nyStudent();
					System.out.println("\nLegge til flere?");
					System.out.println("1: Ja");
					System.out.println("0: Nei");
					svar = in.nextInt();
					if (svar == 0) {
						break;
					}
				}
			} else if (svar == 2) {
				System.out.println("Antall Studenter er :" + Oversikt.finnAntallStudenter());
			} else if (svar == 3) {
				Oversikt.toString();
				Oversikt.økOppgaverStudent();				
			}else if (svar == 4) {
				Oversikt.toString();
				Oversikt.finnAntallOppgStudent();
			} else if (svar == 5) {
				for(int i = Oversikt.getStudenter().size()-2; i>=0 ; i--) {
					System.out.println("\n"+Oversikt.getStudenter().get(i).toString());
				}
			} 
		}
	}
}
