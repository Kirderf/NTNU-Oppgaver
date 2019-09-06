package øving5;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BrøkRegning {

	
	
	public static void main(String[] args) {
		
	double tellerBrok1 = 1;
	double nevnerBrok1 = 1;
	double tellerBrok2 = 1;
	boolean inputBoolean = true;
	while(inputBoolean){
		
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Teller brøk1: \n");
			tellerBrok1 = input.nextDouble();
			System.out.print("Nevner brøk1: \n");
			nevnerBrok1 = input.nextDouble();
			System.out.print("Teller brøk2: \n");
			tellerBrok2 = input.nextDouble();
			inputBoolean = false;
		}catch(InputMismatchException ime) {
			System.out.println("Kan ikke være noe annet enn tall");
		}
	}
	
	Brøk Brøk1 = new Brøk(tellerBrok1,nevnerBrok1);
	Brøk Brøk2 = new Brøk(tellerBrok2);
	
	
	Brøk1.calcSum(Brøk2);
	System.out.println(Brøk1);
	Brøk1.calcSub(Brøk2);
	System.out.println(Brøk1);
	Brøk1.calcMulti(Brøk2);
	System.out.println(Brøk1);
	Brøk1.calcDel(Brøk2);
	System.out.println(Brøk1);
	}	
}
