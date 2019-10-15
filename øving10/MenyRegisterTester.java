package �ving10;

/*
� � registrere en ny rett.
� � finne en rett, gitt navnet.

� � finne alle retter av en gitt type.
� � registrere en ny meny som best�r av ett sett med retter.
� � finne alle menyer med totalpris innenfor et gitt intervall.
*/
public class MenyRegisterTester {
	public static void main(String[] args) {
		MenyRegister Menyer1 = new MenyRegister();
		System.out.println(Menyer1.addMeny(new Meny("Norsk Meny")));
		System.out.println(Menyer1.addRettToMeny(Menyer1.getMenyer().get(0), new Rett("Norsk frokost", "Frokost", 80, null)));

		System.out.println(Menyer1.getRett("Norsk frokost").toString());
		System.out.println(Menyer1.getTypeRett("Frokost").toString());
		System.out.println(Menyer1.addMeny("Engelsk meny", new Rett("English breakfast", "Frokost", 100, null), null, null));
		
		System.out.println(Menyer1.getMenyTotalPrisIntervall(90, 100).toString());
	}
}
