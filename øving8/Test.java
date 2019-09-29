package øving8;

public class Test {

	public static void main(String[] args) {
		int svar = 1;
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		ArbTaker arbeidstaker = new ArbTaker(new Person("Fredrik", "Julsen", 1999), 0, 2017, 20000);

		while (svar != 0) {
			System.out.println("\n" + arbeidstaker.toString());
			System.out.println( arbeidstaker.personalia.getFornavn()+" ansatt lengere enn 3 år? : " + arbeidstaker.sjekkÅrAnsatt(3));
			System.out.println("\nEndre noe?");
			System.out.println("1: Ja");
			System.out.println("2: Nei");
			System.out.println("0: Avslutt");
			svar = inScanner.nextInt();
			if (svar == 0 || svar == 2) {
				break;
			}
			System.out.println("Hva vil du endre?");
			System.out.println("1: Arbeidstaker Nummer");
			System.out.println("2: Ansettelsesår");
			System.out.println("3: Månedslønn (brutto)");
			System.out.println("0: Avslutt");
			svar = inScanner.nextInt();
			switch (svar) {
			case (1):
				System.out.print("Nytt arbeidstaker nr: ");
				arbeidstaker.setArbTakerNr(inScanner.nextInt());
				break;
			case (2):
				System.out.print("Nytt ansettelsesår: ");
				arbeidstaker.setAnsettelsesÅr(inScanner.nextInt());
				break;
			case (3):
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
