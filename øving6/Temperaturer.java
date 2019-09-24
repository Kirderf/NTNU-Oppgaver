package øving6;

import java.util.Random;
import java.lang.Math;

public class Temperaturer {
	static int temperatur[][] = new int[30][24];

	public static void createRandomTempArray() {
		Random grad = new java.util.Random();

		for (int i = 0; i < temperatur.length; i++) {

			for (int j = 0; j < temperatur[i].length; j++) {
				temperatur[i][j] = (grad.nextInt(30) * ((int) Math.pow(-1, grad.nextInt(2))));
				System.err.print(temperatur[i][j] + ",");
			}

			System.err.println(" ");
		}
	}

	public static double getMiddleTempPrDag(int[][] temperatur, int dagArrayNr) {
		double totalGrader = 0;
		for (int i = 0; i < temperatur[dagArrayNr].length; i++) {
			totalGrader += temperatur[dagArrayNr][i];
		}
		// System.out.println(dagnr+1);
		// System.out.println(totalGrader);
		// System.out.println(temperatur[dagnr].length);
		return totalGrader / temperatur[dagArrayNr].length;
	}

	public static double getMiddleTempPrMånedPrTime(int[][] temperatur) {
		double totalGrader = 0;
		double timer = 0; // timer i måneden
		for (int j = 0; j < temperatur.length; j++) {
			for (int i = 0; i < temperatur[j].length; i++) {
				totalGrader += temperatur[j][i];
				timer++;
				// System.out.println(timer);
			}
		}
		System.err.println(totalGrader);
		System.err.println(timer);
		return totalGrader / timer;
	}

	public static double getMiddleTempPrMånedPrDag(int[][] temperatur) {
		double totalGrader = 0;
		double dager = 0; // dager i måneden
		for (int j = 0; j < temperatur.length; j++) {
			for (int i = 0; i < temperatur[j].length; i++) {
				totalGrader += temperatur[j][i];

			}
			dager++;
		}
		System.err.println(totalGrader / 24);
		System.err.println(dager);
		return (totalGrader / 24) / dager;
	}

	public static void calcAntallDagerTempGrader(int[][] temperatur) {
		int[] Counter = new int[5];
		for (int i = 0; i < temperatur.length; i++) {
			if (getMiddleTempPrDag(temperatur, i) < -5) {
				Counter[0]++;
			} else if (getMiddleTempPrDag(temperatur, i) < 0) {
				Counter[1]++;
			} else if (getMiddleTempPrDag(temperatur, i) < 5) {
				Counter[2]++;
			} else if (getMiddleTempPrDag(temperatur, i) <= 10) {
				Counter[3]++;
			} else if (getMiddleTempPrDag(temperatur, i) > 10) {
				Counter[4]++;
			}

		}
		System.out.println("Antalldager under -5 grader: " + Counter[0]);
		System.out.println("Antalldager under 0 grader: " + Counter[1]);
		System.out.println("Antalldager under 5 grader: " + Counter[2]);
		System.out.println("Antalldager under 10 og 10 grader: " + Counter[3]);
		System.out.println("Antalldager over 10 grader: " + Counter[4]);
	}
}