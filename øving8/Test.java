package �ving8;

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
			System.out.println("3: F�dsels�r");
			System.out.println("4: M�nedsl�nn (brutto)");
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
				System.out.print("Nytt f�dsels�r: ");
				arbeidstaker.setF�dsels�r(inScanner.nextInt());
				break;
			case (4):
				System.out.print("Ny m�nedsl�nn (brutto): ");
				arbeidstaker.setM�nedsl�nnBrutto(inScanner.nextDouble());
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
