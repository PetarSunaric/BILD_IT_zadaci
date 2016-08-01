package zadaci_01_08_2016;

public class Zadatak_4 {

	public static void main(String[] args) {
		int counter = 0;
		// Napravimo niz
		int array[] = new int[100];

		// Dodajemo random brojeve u niz
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		/*
		 * Prolazimo kroz niz i brojeve od 0 do 9 i brojimo koliko se koji broj
		 * puta ponovio
		 */
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == array[j]) {
					counter++;
				}
			}
			System.out.println("Broj " + i + " se ponovio " + counter + " puta.");
			counter = 0;
		}
	}
}