package �ving5;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Br�kRegning {

	
	
	public static void main(String[] args) {
		
	double tellerBrok1 = 1;
	double nevnerBrok1 = 1;
	double tellerBrok2 = 1;
	boolean inputBoolean = true;
	while(inputBoolean){
		
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Teller br�k1: \n");
			tellerBrok1 = input.nextDouble();
			System.out.print("Nevner br�k1: \n");
			nevnerBrok1 = input.nextDouble();
			System.out.print("Teller br�k2: \n");
			tellerBrok2 = input.nextDouble();
			inputBoolean = false;
		}catch(InputMismatchException ime) {
			System.out.println("Kan ikke v�re noe annet enn tall");
		}
	}
	
	Br�k Br�k1 = new Br�k(tellerBrok1,nevnerBrok1);
	Br�k Br�k2 = new Br�k(tellerBrok2);
	
	System.out.println("Summen av br�kene er: "+Br�k.calcSum(Br�k1.br�k,Br�k2.br�k));
	System.out.println("Br�k1 minus Br�k2 er: "+Br�k.calcSub(Br�k1.br�k,Br�k2.br�k));
	System.out.println("Br�kene multiplisert er: " + Br�k.calcMulti(Br�k1.br�k,Br�k2.br�k));
	System.out.println("Br�k1 dele p� br�k2 er: " + Br�k.calcDel(Br�k1.br�k,Br�k2.br�k));
	
	}	
}
