package øving6;
public class Oppgave1 {
	static java.util.Random random = new java.util.Random();
	public static void main(String[] args) {
		
		final int ANTALLGANGER = 10;
		int[] antall = new int[ANTALLGANGER];
		
		for(int i = 0;i < ANTALLGANGER; i++) {
			int randoms = random.nextInt(10);
			antall[randoms]++;
		}
		
		for(int i = 0;i < 10; i++) {
	        System.out.println((i+1)+"'s: " + arrayCount(antall, i));
	    }
		
	}

	public static int arrayCount(int[] array, int item) {
	    return array[item];
	}
}