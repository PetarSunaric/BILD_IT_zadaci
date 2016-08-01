package zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak_5 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		int max, counter = 0;
		ArrayList<Integer> list = new ArrayList<>();

		// Trazimo unos od korisnika
		System.out.println("Molimo unesite niz, 0 prekida unos: ");
		int num = input.nextInt();
		// Nastavljamo traziti unos sve dok korisnik ne ispuni uslov,i napravi
		// prekid sa nulom
		while (num != 0) {
			list.add(num);
			num = input.nextInt();
		}
		input.close();
		// Nadjemo najveci element u listi
		max = Collections.max(list);

		// Prebrojimo koliko je puta unesen
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == max) {
				counter++;
			}
		}
		System.out.println("Najveci element koji ste unijeli je " + max + " unijeli ste ga " + counter + "puta.");
	}
}
