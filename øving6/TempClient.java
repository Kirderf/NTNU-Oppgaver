package �ving6;

public class TempClient {
	public static void main(String[] args) {
		Temperaturer.createRandomTempArray();
		System.err.println(Temperaturer.temperatur.length);
		System.err.println(Temperaturer.temperatur[0].length);
		System.out.println(
				"Middeltemperaturen p� dag 1 er " + Temperaturer.getMiddleTempPrDag(Temperaturer.temperatur, 0));
		System.out.println("Middeltemperaturen p� m�neden per time er "
				+ Temperaturer.getMiddleTempPrM�nedPrTime(Temperaturer.temperatur));
		System.out.println("Middeltemperaturen p� m�neden per dag er "
				+ Temperaturer.getMiddleTempPrM�nedPrDag(Temperaturer.temperatur));
		Temperaturer.calcAntallDagerTempGrader(Temperaturer.temperatur);

	}

}
