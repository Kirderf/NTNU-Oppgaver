package practiceØvinger;
import static javax.swing.JOptionPane.*;

public class StjerneLøkke {
	private static String stjerneLinjer;
	private static int antallLinjer;
	private static int antallMellomrom;
	
	
	public static void main(String[] args) {
		stjerneLinjer = "";
		antallLinjer = Integer.parseInt(showInputDialog("Hvor mange linjer? : "));
		antallMellomrom = antallLinjer-1;

			for(int i = 1; antallLinjer>=i;i++) {
				mellomrom(i);
				stjerneLinjer += " *";
				System.out.println(stjerneLinjer);

			}
		}
	public static void mellomrom(int iAntall) {
		for (int i = antallMellomrom; iAntall <= i; i--) {
		System.out.print(" ");
		}
		return;
	}
}

