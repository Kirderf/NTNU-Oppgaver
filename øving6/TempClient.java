package øving6;

public class TempClient {
	public static void main(String[] args) {
		Temperaturer.createRandomTempArray();
		System.err.println(Temperaturer.temperatur.length);
		System.err.println(Temperaturer.temperatur[0].length);
		System.out.println(
				"Middeltemperaturen på dag 1 er " + Temperaturer.getMiddleTempPrDag(Temperaturer.temperatur, 0));
		System.out.println("Middeltemperaturen på måneden per time er "
				+ Temperaturer.getMiddleTempPrMånedPrTime(Temperaturer.temperatur));
		System.out.println("Middeltemperaturen på måneden per dag er "
				+ Temperaturer.getMiddleTempPrMånedPrDag(Temperaturer.temperatur));
		Temperaturer.calcAntallDagerTempGrader(Temperaturer.temperatur);

	}

}
