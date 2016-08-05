package zadaci_04_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite 9 cifara ISBN broja: ");
		int[] array = new int[9];
		int result = 0;

		// Napunimo niz
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			result = array[i] * (i + 1) + result;
		}
		// Ispisujemo uneseni broj
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		// Izracunamo poslednji broj,i dodajemo na uneseni
		int sum = result % 11;

		if (sum == 10)
			System.out.print("X");
		else
			System.out.println(sum);
	}
}
