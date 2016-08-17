package zadaci_17_08_2016;

import java.io.Serializable;

public class Zadatak_3 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Molimo unesite vas broj short tipa: ");
		short s = input.nextShort();
		// Prebacujemo broj u binarni broj i string
		String m = Integer.toBinaryString(s);
		System.out.println("Binarni kod unesenog broja je: ");
		// Racunamo koliko nam nula treba i ispisujemo nule pa binarni broj
		// unesenog broja
		int b = 16 - m.length();
		for (int i = 0; i < b; i++) {
			System.out.print(i * 0);
		}
		System.out.println(m);
	}
}
