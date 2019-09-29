package øving7;

/* Den skal ha en objektvariabel av klassen String. Klassen
NyString skal være immutabel og tilby følgende tjenester:

• Konstruktør som tar et objekt av klassen String som argument.

• Forkorting. Forkortingen skal skje ved at første tegn i hvert ord plukkes ut. Bruk
mellomrom som skille mellom ordene. Eksempel: «denne setningen kan forkortes»
skal forkortes til «dskf». Tips: Bruk String-metoden split(), som returnerer en tabell
med ordene som teksten består av: String() ord = tekst.split()

• Fjerning av tegn. Eksempel: Dersom tegnet ‘e’ fjernes fra teksten «denne setningen
kan forkortes», står vi igjen med «dnn stningn kan forkorts». Tips: Bruk en whileløkke og for eksempel String-metodene indexOf() og substring().
*/
public final class NyString {
	private String teksten;

	public NyString(String teksten) {
		this.teksten = teksten;
	}

	public static void main(String[] args) {
		NyString tekst = new NyString("denne setningen kan forkortes");
		System.out.println(tekst.firstCharString());
		System.out.println(tekst.removeChar('e'));

	}

	public String firstCharString() {
		String[] ord = teksten.split(" ");
		String forkortettekst = "";
		for (int i = 0; i < ord.length; i++) {
			forkortettekst += Character.toString(ord[i].charAt(0));
		}
		return forkortettekst;

	}

	public String removeChar(char a) {
		String charSelected = Character.toString(a);
		String nyString = null;
		for (int i = 0; i < teksten.toCharArray().length; i++) {
			nyString = teksten.replace(charSelected, "");
		}
		return nyString;

	}
}
