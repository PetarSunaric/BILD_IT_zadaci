package zadaci_15_08_2016;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak_1 {

	public static void main(String[] args) {
		// Koristimo string za mjesece, i trazimo random broj.
		String[] mjeseci = { "Januar", "Februar", "Mart", "April", "Maj", "Juni", "Juli", "August", "Septembar",
				"Oktobar", "Novembar", "Decembar" };
		int num = (int) (1 + Math.random() * 12);

		System.out.println(num + " je mjesec " + mjeseci[num - 1]);
	}
}
