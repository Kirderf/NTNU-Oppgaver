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
	
	
	Br�k1.calcSum(Br�k2);
	System.out.println(Br�k1);
	Br�k1.calcSub(Br�k2);
	System.out.println(Br�k1);
	Br�k1.calcMulti(Br�k2);
	System.out.println(Br�k1);
	Br�k1.calcDel(Br�k2);
	System.out.println(Br�k1);
	}	
}
