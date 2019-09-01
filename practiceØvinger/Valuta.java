package practiceÿvinger;
public class Valuta {
	String ValutaName;
	int CurrencyRate;
	
	
	Valuta(String name, int NOKRate) {
		this.ValutaName = name;
		this.CurrencyRate = NOKRate;
		
	}
	public static void main(String[] args) {
		
		
		Valuta USD = new Valuta("Amerikanske dollar", 10);
		
		
		System.out.println(USD.ValutaName);
	}
}
