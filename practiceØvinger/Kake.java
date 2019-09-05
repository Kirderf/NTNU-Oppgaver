package practiceØvinger;

public class Kake {
	// Type,glasur,antall stykker,bunn,spistopp
	private static String type;
	private static int antallStykker;
	private static String bunn;
	private static boolean spistopp;
	
	public Kake(String type, int antallStykker, String bunn, boolean spistopp){
		this.type = type;
		this.antallStykker = antallStykker;
		this.bunn = bunn;
		this.spistopp = spistopp;
	}
	public static void main(String[]args) {
		Kake KakeMarsipan = new Kake("Marsipan",10, "Sukkerbrød",false);
		Kake KakeSjokolade = new Kake("Sjokolade",0,"Sjokoladekakebunn",true);
	}
	
}
