package zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak_1 {

	public static Integer max(ArrayList<Integer> list) {
		// Metoda koja racuna i vraca najvecu vrijednost liste
		if (list == null || list.isEmpty()) {
			return null;
		} else {
			return Collections.max(list);
		}

	}
	public static void main(String[] args) {
		// Napravljena ArrayLista u koju smo dodali elemente
		ArrayList<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(1);
		list.add(4);
		list.add(70);
		list.add(8);

		// Pozivanje metode max i ispis korisniku
		System.out.println("Najveci broj na vasoj listi je " + max(list));
	}
}
