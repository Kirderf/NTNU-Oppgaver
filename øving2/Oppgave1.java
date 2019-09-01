package øving2;

import java.util.*;

public class Oppgave1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean skuddaar = false;
		
		do {
			int aar;
			// Validering av input verdi
			do {
				System.out.println("Er året et skuddår? : ");
				aar = in.nextInt();
				if (aar <= 0){
					System.out.println("Ugyldig år");
					}
				}while(aar <= 0);
			
			// logikk om året er delelig på 4 også om det er delelig på 400 som er ett unntak
			if (aar%4 == 0){
				if(aar%400 == 0 ) {
					System.out.println("Årethundret kan deles med 400 og er et unntak");
					skuddaar = true;
				} 
				else if(aar%100 == 0){
					System.out.println("Ikke et skudd år");					
				}
				
				else{
					System.out.println("Året kan deles på 4 og er et skudd år");
					skuddaar = true;
				}
			}
			else{ 
				System.out.println("Ikke et skudd år");
			}
			
		} 
		while(skuddaar == false);
		
		

			
	}

}
