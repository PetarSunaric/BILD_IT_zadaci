package zadaci_09_08_2016;

public class Zadatak_3 {

	public static void main(String[] args) {
		int counter = 0;
		/*
		 * Koristimo petlju za ispis brojeva, ako su djeljivi sa 5 i 6
		 * ispisujemo kad brojac postane djeljiv sa deset bez ostatka
		 * prebacujemo u novi red
		 */
		for (int i = 100; i <= 1000; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				System.out.print(i + " ");
				counter++;
				if (counter % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
}
