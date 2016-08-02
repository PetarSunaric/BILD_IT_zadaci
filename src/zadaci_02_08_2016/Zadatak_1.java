package zadaci_02_08_2016;

public class Zadatak_1 {

	public static void main(String[] args) {
		int counter = 0;
		/*
		 * Ispisujemo sve prestupne godine i ispisujemo ih korisniku, ujedno ih
		 * brojimo i dijelimo sa deset, da bismo prebacili u novi red
		 */
		for (int i = 101; i <= 2100; i++) {
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				System.out.print(i + " ");
				counter++;
				if (counter % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("Ukupan broj prestupnih godina od 101 do 2100 je " + counter);
	}
}
