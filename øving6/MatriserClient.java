package øving6;

public class MatriserClient {
	public static void main(String[] args) {
		Matriser Matrise1 = new Matriser(2, 2);
		Matriser Matrise2 = new Matriser(2, 2);

		Matrise1.Matrise[0][0] = 1;
		Matrise1.Matrise[0][1] = 2;
		Matrise1.Matrise[1][0] = 1;
		Matrise1.Matrise[1][1] = 2;
		System.out.println(Matrise1.toString());
		Matrise2.Matrise[0][0] = 2;
		Matrise2.Matrise[0][1] = 2;
		Matrise2.Matrise[1][0] = 1;
		Matrise2.Matrise[1][1] = 1;
		System.out.println(Matrise2.toString());
		System.out.println("Summen av Matrisene er : ");
		Matriser.printMatrix(Matriser.calcMatriserAdd(Matrise1, Matrise2));
		System.out.println("Produktet av Matrisene er : ");
		Matriser.printMatrix(Matriser.calcMatriserMulti(Matrise1, Matrise2));
		System.out.println("Transponerer en Matrise");
		Matriser.printMatrix(Matriser.calcMatriserTranspose(Matrise1));

	}
}
