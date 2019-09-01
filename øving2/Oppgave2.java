package øving2;

public class Oppgave2 {

	public static void main(String[] args) {
		double MerkeApris = 35.90; // Pris i kr
		double MerkeBpris = 39.50; // Pris i kr
		
		double MerkeAgram = 450; // enhet i gram
		double MerkeBgram = 500; // enhet i gram
		
		double MerkeAkgpris = (MerkeApris/(MerkeAgram/1000));
		double MerkeBkgpris = (MerkeBpris/(MerkeBgram/1000));
		double MerkeAgrampris = (MerkeApris/MerkeAgram);
		double MerkeBgrampris = (MerkeBpris/MerkeBgram);
		
		if (MerkeAkgpris > MerkeBkgpris) {
			System.out.println("Merke B er billigere og koster " + MerkeBkgpris + "kr/kg eller " + MerkeBgrampris + "kr/g" );
		}else if (MerkeAkgpris < MerkeBkgpris) {
			System.out.println("Merke A er billigere og koster " + MerkeAkgpris + "kr/kg eller" + MerkeAgrampris + "kr/g");
		}else {
			System.out.println("Feil i data");
		}
	}

}
