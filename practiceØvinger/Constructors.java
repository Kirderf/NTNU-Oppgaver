package practiceÿvinger;

public class Constructors {
	
	
	 String name;
	 int value;
	 
	 
	 
	   //Valuta Constructor
	   Constructors(String name, int value){
	      this.name = name;
	      this.value = value;
	   }
	   
	   
	   
	   public static void main(String[] args) {
	      Constructors USD = new Constructors("USD", 0);
	      Constructors EURO = new Constructors("Euro", 0);
	      Constructors SEK = new Constructors("SEK", 0);
	      System.out.println(USD.name + USD.value);
	      
	   }
}
