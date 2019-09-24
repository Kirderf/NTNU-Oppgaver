package øving8;

public class Test {

	public static void main(String[] args) {
		int svar = 1;
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		ArbTaker arbeidstaker = new ArbTaker("Fredrik", "Julsen", 1999, 0, 2017, 20000);

		while (svar != 0) {
			System.out.println("\n" + arbeidstaker.toString());
			System.out.println("\nEndre noe?");
			System.out.println("1: Ja");
			System.out.println("2: Nei");
			System.out.println("0: Avslutt");
			svar = inScanner.nextInt();
			if (svar == 0 || svar == 2) {
				break;
			}
			System.out.println("Hva vil du endre?");
			System.out.println("1: Fornavn");
			System.out.println("2: Etternavn");
			System.out.println("3: Fødselsår");
			System.out.println("4: Månedslønn (brutto)");
			System.out.println("0: Avslutt");
			svar = inScanner.nextInt();
			switch (svar) {
			case (1):
				System.out.print("Nytt fornavn: ");
				arbeidstaker.setFornavn(inScanner.next());
				break;
			case (2):
				System.out.print("Nytt etternavn: ");
				arbeidstaker.setEtternavn(inScanner.next());
				break;
			case (3):
				System.out.print("Nytt fødselsår: ");
				arbeidstaker.setFødselsår(inScanner.nextInt());
				break;
			case (4):
				System.out.print("Ny månedslønn (brutto): ");
				arbeidstaker.setMånedslønnBrutto(inScanner.nextDouble());
				break;
			default:
				break;
			}
			if (svar == 0) {
				break;
			}

		}
	}

}
