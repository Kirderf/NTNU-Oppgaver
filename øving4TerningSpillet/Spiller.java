package øving4TerningSpillet;


public class Spiller {
	public java.util.Random terning = new java.util.Random();
	public String navn;
	private static int sumPoeng;
	private static int terningKast;
	private static boolean erFerdig;
	
	public Spiller(String navn){
		this.navn = navn;
	}
	public static int getSumPoeng(int nåværendePoeng, int økning, String navn) {
		if(økning == 1) {
			sumPoeng = 0;
			System.out.println("Spiller " + navn + " kastet en 1er");
			return sumPoeng;	
		}
		sumPoeng = (nåværendePoeng + økning);
		return sumPoeng;
	}
	
	public int kastTerning() {
		terningKast = 0;
		while(terningKast == 0) {
		terningKast = terning.nextInt(6);
		}
		return terningKast;
	}
	public boolean erFerdig(int poengSum) {
		erFerdig = false;
		if(poengSum == 100) {
			return true;
		}
		return erFerdig;
	}
}
