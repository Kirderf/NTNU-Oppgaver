package øving6;
public class Oppgave1 {
	public static void main(String[] args) {
		java.util.Random random = new java.util.Random();
		final int ANTALLGANGER = 10000;
		
		int[] antall = new int[10];
		
		for(int i = 0;i < ANTALLGANGER; i++) {
			int randoms = random.nextInt(10);
			antall[randoms]++;
		}
		for(int j = 0; j < antall.length; j++) {
			System.out.println((j+1)+"ere : "+antall[j]);
		}
		
	}
}