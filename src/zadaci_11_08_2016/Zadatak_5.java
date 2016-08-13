package zadaci_11_08_2016;

import java.util.ArrayList;

public class Zadatak_5 {

	public static void main(String[] args) {
		double sum = 0;
		int pozitivni = 0, negativni = 0, prosek = 0, num = 0;
		java.util.Scanner input = new java.util.Scanner(System.in);
		// Uzimati unos od korisnika sve dok ne unese nulu, racunamo negativne i
		// pozitivne brojeve i sumu
		System.out.println("Molimo unesite vase brojeve (0 prekida unos) : ");
		do {
			num = input.nextInt();
			if (num > 0) {
				pozitivni++;
			} else if (num < 0) {
				negativni++;
			}
			sum += num;
		} while (num != 0);

		// Ispisujemo i racunamo prosek
		System.out
				.println("Zbir unesenih brojeva je " + sum + " ,pozitivnih brojeva ima " + pozitivni + " a negativnih "
						+ negativni + ".Prosek unesenih brojeva iznosi " + (sum / (pozitivni + negativni)) + ".");
	}
}
