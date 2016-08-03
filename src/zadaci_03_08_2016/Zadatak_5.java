package zadaci_03_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_5 {
	public static double[][] sortRow(double[][] array) {

		double[][] result = new double[array.length][array[0].length];

		// Kopiramo iz niza u novi niz
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[0].length; j++)
				result[i][j] = array[i][j];

		int temp = 0;
		// Sortiramo brojeve od manjeg ka vecem
		for (int row = 0; row < result.length; row++) {
			for (int col = 0; col < result[row].length; col++) {
				for (int Col = col; Col < result[row].length; Col++) {
					if (result[row][col] > result[row][Col]) {
						temp = (int) result[row][col];
						result[row][col] = result[row][Col];
						result[row][Col] = temp;
					}
				}
				System.out.print((int) result[row][col] + " ");
			}
			System.out.println();
		}
		return result;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		double array[][] = new double[3][3];
		// Unosimo matricu.
		System.out.println("Unesite vasu matricu 3x3: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		// Poziv metode za sortranje
		sortRow(array);
	}
}
