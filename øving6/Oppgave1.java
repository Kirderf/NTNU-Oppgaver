package øving6;

public class Oppgave1 {
	public static void main(String[] args) {
		java.util.Random random = new java.util.Random();
		final int ANTALLGANGER = 1000;
		int[] antall = new int[10];

		for (int i = 0; i < ANTALLGANGER; i++) {
			int randoms = random.nextInt(10);
			antall[randoms]++;
		}

		for (int j = 0; j < antall.length; j++) {
			System.out.println(j + " : " + antall[j]);

			for (int i = 0; i < antall[j] / 10; i++) {
				System.out.print("*");
			}

			if (antall[j] % 10 >= 5) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}