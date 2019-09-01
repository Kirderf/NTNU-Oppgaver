package øving3;
import java.util.*;

public class Oppgave2 {
	public static void main (String[] args) {
		while(true) {
			try {
				Scanner in = new Scanner(System.in);
				System.out.print("Tall: ");
				String TallString = in.next();
				int Tall1 = Integer.parseInt(TallString);
				boolean erikkePrimtall = false;
				
				
				if(Tall1== 1 || Tall1<= 0) {
						erikkePrimtall = true;
				}else{
					
					for(int Tall2 = 2; Tall1 > Tall2; Tall2++) {
						
						if((Tall1%Tall2 == 0)||(Tall1%2 == 0)) {
							erikkePrimtall = true;
							
							}
						}
					}
				if (erikkePrimtall) {
					System.out.println(Tall1 + " er ikke et primtall");
				}else{
					System.out.println(Tall1 + " er et primtall");	
				}
			}
			catch(NumberFormatException nfe){ 
				System.out.println("Ikke et tall");
			}
		}
	}
}
