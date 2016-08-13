package zadaci_12_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Zadatak_5 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		int i = 1;
		// Unosimo brojeve dok je unos razlicit od 0, i dodajemo ih u listu
		while (i != 0) {
			System.out.print("Unesite broj od 1 do 100(nula prekida unos): ");
			i = checkInput();
			list.add(i);
		}
		countNum(list);
	}

	public static void countNum(ArrayList<Integer> list) {
		int counter = 0;
		// Uzimamo redom brojeve i provjeravamo koliko su se puta ponovili u
		// list,i brojimo broj ponavljanja
		for (int i = 1; i < 101; i++) {
			for (int j = 0; j < list.size() - 1; j++) {
				if (i == list.get(j))
					counter++;
			}
			// Kada prodje kroz listu za jedan broj,ispisuje koliko se puta
			// ponovio i brojac vraca na nulu
			if (counter > 0) {
				System.out.print("Broj " + i + " se ponovio " + counter + " put");
				if (counter != 11 || counter % 10 == 1) {
					System.out.println("a");
				}
				counter = 0;
			}
		}
	}

	public static int checkInput() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int num = 0;
		boolean error = true;
		// Provjerava da li je unos u redu
		do {
			try {
				num = input.nextInt();
				if (num < 0 || num > 100)
					throw new InputMismatchException("Uneli ste broj manji od 0 ili veci od 100!");
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, unsite ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}
}
