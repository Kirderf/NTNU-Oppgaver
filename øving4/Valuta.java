package øving4;

public class Valuta {
	String valutaName;
	final double NOKRATE;
	
	Valuta(String valutaname, double valutarate){
		this.valutaName = valutaname;
		this.NOKRATE = valutarate;
	}
	
	
	public static double fraNOK(double currentValutaRate, double valutaVerdi) {
		return valutaVerdi /= currentValutaRate;		
	}
	
	public static double tilNOK(double currentValutaRate, double valutaVerdi) {
		return valutaVerdi *= currentValutaRate;
	}
}
