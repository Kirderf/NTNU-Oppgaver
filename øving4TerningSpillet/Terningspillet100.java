package øving4TerningSpillet;

import java.util.Scanner;

public class Terningspillet100 {
	//Deklarering av variabler
	public static boolean tur;
	public static int poengSum1;
	public static int poengSum2;
	public static int rundeNummer;
	public static String navn1;
	public static String navn2;
	public static int terningKastSpiller1;
	public static int terningKastSpiller2;
	public static Scanner in = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		//inizilialiserer poengsummene, rundenummeret og turen
		poengSum1 = 0;
		poengSum2 = 0;
		rundeNummer = 0;
		tur = true; // Spiller 1 starter / Endre til false for at spiller 2 skal starte
		System.out.println("Navn spiller 1: ");
		navn1 = in.next();
		System.out.println("Navn spiller 2: ");
		navn2 = in.next();

		Spiller Spiller1 = new Spiller(navn1);
		System.out.println("Spiller 1 er : " + Spiller1.navn+ "\n");
		Spiller Spiller2 = new Spiller(navn2);
		System.out.println("Spiller 2 er : " + Spiller2.navn+ "\n");

		do {
			if (Spiller1.erFerdig(poengSum1)){
				System.out.println(Spiller1.navn + " vant!");
				break;
			}else if (Spiller2.erFerdig(poengSum2)) {
				System.out.println(Spiller2.navn + " vant!");
				break;
			}
			rundeNummer++;
			System.out.println("Rundenummer: "+rundeNummer);
			if(tur == true) {
				//spiller 1 sin tur
				terningKastSpiller1 = Spiller1.kastTerning();
				if(poengSum1>100) {terningKastSpiller1=-terningKastSpiller1;}
				poengSum1 = Spiller.getSumPoeng(poengSum1 ,terningKastSpiller1, navn1);
				System.out.println(Spiller1.navn + " har "+ poengSum1 +"poeng");
				tur = false;
			}
			else if(tur == false) {
				
				//spiller 2 sin tur
				terningKastSpiller2 = Spiller2.kastTerning();
				if(poengSum2>100) {terningKastSpiller2=-terningKastSpiller2;}
				poengSum2 = Spiller.getSumPoeng(poengSum2 ,terningKastSpiller2, navn2);
				System.out.println(Spiller2.navn + " har "+ poengSum2 +"poeng");
				tur = true;
			}
			
		}while((poengSum1<100)||(poengSum2<100));
	}
}
