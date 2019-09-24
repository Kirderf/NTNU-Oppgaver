package øving6;

public final class Matriser {

	int[][] Matrise;
	private int rows;
	private int columns;

	public Matriser(int y, int x) {
		this.Matrise = new int[y][x];
		this.columns = x;
		this.rows = y;
	}

	public int[][] getMatrise() {
		return Matrise;
	}

	public int getColumns() {
		return columns;
	}

	public int getRows() {
		return rows;
	}

	public static Matriser calcMatriserAdd(Matriser Matrise1, Matriser Matrise2) {
		System.err.println("Checking Matrixes");
		if (!((Matrise1.getColumns() == Matrise2.getColumns()) == (Matrise1.getRows() == Matrise2.getRows()))) {
			return null;
		}
		System.err.println("Createing local Matrix");
		Matriser Matrise3 = new Matriser(Matrise1.getRows(), Matrise2.getColumns());

		System.err.println("Adding Matrixes");
		for (int i = 0; i < Matrise1.getColumns(); i++) {
			for (int j = 0; j < Matrise1.getRows(); j++) {
				Matrise3.Matrise[i][j] = Matrise1.Matrise[i][j] + Matrise2.Matrise[i][j];
			}
		}
		System.err.println("Finished Adding Matrixes");

		return Matrise3;
	}

	public static Matriser calcMatriserMulti(Matriser Matrise1, Matriser Matrise2) {
		System.err.println("Checking Matrixes");
		if (!(Matrise1.getColumns() == Matrise2.getRows())) {
			return null;
		}
		System.err.println("Creating local Matrix");
		Matriser Matrise3 = new Matriser(Matrise1.getRows(), Matrise2.getColumns());

		System.err.println("Multiplying Matrixes");
		for (int i = 0; i < Matrise1.Matrise.length; i++) {
			for (int j = 0; j < Matrise1.Matrise[0].length; j++) {
				Matrise3.Matrise[i][j] += Matrise1.Matrise[i][j] * Matrise2.Matrise[j][i];
			}
		}
		System.err.println("Finished Multiplying Matrixes");
		return Matrise3;
	}

	public static Matriser calcMatriserTranspose(Matriser Matrise1) {
		System.err.println("Createing local Matrix");
		Matriser Matrise3 = new Matriser(Matrise1.getRows(), Matrise1.getColumns());
		for (int i = 0; i < Matrise1.getRows(); i++) {
			for (int j = 0; j < Matrise1.getColumns(); j++) {
				Matrise3.Matrise[i][j] = Matrise1.Matrise[j][i];
			}
		}

		return Matrise3;

	}

	public static void printMatrix(Matriser Matrise) {
		for (int i = 0; i < Matrise.Matrise.length; i++) {
			System.out.println("RadNr: " + i);
			for (int j = 0; j < Matrise.Matrise[0].length; j++) {
				System.out.println(Matrise.Matrise[i][j]);
			}

		}
	}

	public static String printMatrix(int[][] Matrise) {
		for (int i = 0; i < Matrise.length; i++) {
			System.out.println("RadNr: " + i);
			for (int j = 0; j < Matrise[0].length; j++) {
				System.out.println(Matrise[i][j]);
			}
		}
		return "Printed Matrix";
	}

	public String toString() {
		return "Antall rader: " + getRows() + " Antall kolonner :" + getColumns() + " Matrisen: "
				+ printMatrix(this.Matrise);

	}
}
