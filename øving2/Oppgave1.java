package �ving2;

import java.util.*;

public class Oppgave1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean skuddaar = false;
		
		do {
			int aar;
			// Validering av input verdi
			do {
				System.out.println("Er �ret et skudd�r? : ");
				aar = in.nextInt();
				if (aar <= 0){
					System.out.println("Ugyldig �r");
					}
				}while(aar <= 0);
			
			// logikk om �ret er delelig p� 4 ogs� om det er delelig p� 400 som er ett unntak
			if (aar%4 == 0){
				if(aar%400 == 0 ) {
					System.out.println("�rethundret kan deles med 400 og er et unntak");
					skuddaar = true;
				} 
				else if(aar%100 == 0){
					System.out.println("Ikke et skudd �r");					
				}
				
				else{
					System.out.println("�ret kan deles p� 4 og er et skudd �r");
					skuddaar = true;
				}
			}
			else{ 
				System.out.println("Ikke et skudd �r");
			}
			
		} 
		while(skuddaar == false);
		
		

			
	}

}
