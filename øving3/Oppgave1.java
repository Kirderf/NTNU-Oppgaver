package øving3;

import java.util.*;

public class Oppgave1 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Hvilken del av gangetabellen skal skrives ut? (start) ");
	String startString = in.next();
	
	System.out.println("Hvilken del av gangetabellen skal skrives ut? (slutt) ");
	String sluttString = in.next();
	
		try {
			int start = Integer.parseInt(startString);
			int slutt = Integer.parseInt(sluttString);
			
			for (;start<=slutt; start++) {
				for(int i = 1; i<= 10; i++) {
					System.out.println(start + " x " + i + " = " + start*i );
				}
			}
		}
		catch(NumberFormatException nfe){ 
		System.out.println("Ikke et nummer");

		}
		
	
	}

}
